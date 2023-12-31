package ch11;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;


public class BoardDao {
	// singleton
	private static BoardDao instance = new BoardDao();
	private BoardDao() {}
	public static BoardDao getInstance() {
		return instance;
	}
	// database connection pool
	private Connection getConnection() {
		Connection conn = null;
		try {
			Context ctx = new InitialContext();
			DataSource ds = (DataSource)
				ctx.lookup("java:comp/env/jdbc/OracleDB");
			conn = ds.getConnection();
		}catch (Exception e) {
			System.out.println("연결 에러 : "+e.getMessage());;
		}
		return conn;
	}
//	public List<Board> list() {
	public List<Board> list(int startRow, int endRow) {
		List<Board> list = new ArrayList<Board>();
		Connection conn = getConnection();
		PreparedStatement pstmt = null;
		ResultSet rs = null;
	//	String sql = "select * from board1 order by num desc";
//		String sql="select * from board1 order by ref desc,re_step";
//      mysql
//		String sql="select * from board1 order by ref desc,re_step limit srartRow - 1, 10";
//		oracle
		String sql="select * from (select rowNum rn,a.* from ("
				+ "select * from board1 order by ref desc, re_step)a) "
				+ "where rn between ? and ?"; 
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, startRow);
			pstmt.setInt(2, endRow);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				Board board = new Board();
				board.setNum(rs.getInt("num"));
				board.setWriter(rs.getString("writer"));
				board.setSubject(rs.getString("subject"));
				board.setContent(rs.getString("content"));
				board.setReadcount(rs.getInt("readcount"));
				board.setPassword(rs.getString("password"));
				board.setRef(rs.getInt("ref"));
				board.setRe_level(rs.getInt("re_level"));
				board.setRe_step(rs.getInt("re_step"));
				board.setReg_date(rs.getDate("reg_date"));
				board.setDel(rs.getString("del"));
				
				list.add(board);
			}
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}finally {
			try {
				if (rs != null) rs.close();
				if (pstmt != null) pstmt.close();
				if (conn != null) conn.close();
			}catch (Exception e) {	}
		}
		return list;
	}
	public int insert(Board board) {		
		int result = 0;
		Connection conn = getConnection();
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		// num 값을 1씩 증가
		String sql2="select nvl(max(num),0) + 1 from board1";
		String sql="insert into board1 "
				+ "values(?,?,?,?,0,?,?,?,?,sysdate,'n')";
		String sqlUp="update board1 set re_step=re_step+1 "
				+ " where ref=? and re_step > ?";
		try {
			pstmt = conn.prepareStatement(sql2); // sql2관련 객체
			rs = pstmt.executeQuery();
			rs.next();
			int number = rs.getInt(1); // 가장 큰번호 + 1
			pstmt.close(); // sql2에 관련된 객체 종료
			if (board.getNum() != 0 ) {  // 답변글
				pstmt = conn.prepareStatement(sqlUp);
				pstmt.setInt(1, board.getRef());
				pstmt.setInt(2, board.getRe_step());
				pstmt.executeUpdate();
				pstmt.close();
				board.setRe_step(board.getRe_step()+1);
				board.setRe_level(board.getRe_level()+1);
			} else board.setRef(number); //답변글이 아닐때는 num과 같음
			pstmt = conn.prepareStatement(sql); // sql 를 사용할 객체 
			pstmt.setInt(1, number);
			pstmt.setString(2, board.getWriter());
			pstmt.setString(3, board.getSubject());
			pstmt.setString(4, board.getContent());
			pstmt.setString(5, board.getPassword());	
			// 답변글 시작
			pstmt.setInt(7, board.getRe_step());
			pstmt.setInt(8, board.getRe_level());
			pstmt.setInt(6, board.getRef());
			// 답변글 끝
			result = pstmt.executeUpdate();
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}finally {
			try {
				if (rs != null) rs.close();
				if (pstmt != null) pstmt.close();
				if (conn != null) conn.close();
			}catch (Exception e) {	}
		}
		return result;
	}
	public Board select(int num) {
		Board board = new Board();
		Connection conn = getConnection();
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String sql="select * from board1 where num=?";
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, num);
			rs = pstmt.executeQuery();
			if (rs.next()) {				
				board.setNum(rs.getInt("num"));
				board.setWriter(rs.getString("writer"));
				board.setSubject(rs.getString("subject"));
				board.setContent(rs.getString("content"));
				board.setReadcount(rs.getInt("readcount"));
				board.setPassword(rs.getString("password"));
				board.setRef(rs.getInt("ref"));
				board.setRe_level(rs.getInt("re_level"));
				board.setRe_step(rs.getInt("re_step"));
				board.setReg_date(rs.getDate("reg_date"));
				board.setDel(rs.getString("del"));
			}
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}finally {
			try {
				if (rs != null) rs.close();
				if (pstmt != null) pstmt.close();
				if (conn != null) conn.close();
			}catch (Exception e) {	}
		}
		return board;
	}
	public void readCountUpdate(int num) {
		Connection conn = getConnection();
		PreparedStatement pstmt = null;
		String sql="update board1 set "
			+ "readcount=readcount+1 where num=?";
		try {
			pstmt = conn.prepareStatement(sql); // sql 를 사용할 객체 
			pstmt.setInt(1, num);			
			pstmt.executeUpdate();
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}finally {
			try {
				if (pstmt != null) pstmt.close();
				if (conn != null) conn.close();
			}catch (Exception e) {	}
		}
	}
	public int update(Board board) {
		int result = 0;
		// board는 화면에서 입력한 데이터, board2는 DB에서 읽은 데이터
		Board board2 = select(board.getNum());
		Connection conn = getConnection();
		PreparedStatement pstmt = null;
		String sql="update board1 set subject=?, content=? where num=?";		
		if (board2.getPassword().equals(board.getPassword())) {
			try {
				pstmt = conn.prepareStatement(sql); // sql 를 사용할 객체 
				pstmt.setString(1, board.getSubject());
				pstmt.setString(2, board.getContent());
				pstmt.setInt(3, board.getNum());
				result = pstmt.executeUpdate();
			}catch (Exception e) {
				System.out.println(e.getMessage());
			}finally {
				try {
					if (pstmt != null) pstmt.close();
					if (conn != null) conn.close();
				}catch (Exception e) {	}
			}
		} else result = -1; // 암호가 다르다		
		return result;
	}
	public int delete(int num, String password) {
		int result = 0;
		Board board2 = select(num);
		Connection conn = getConnection();
		PreparedStatement pstmt = null;
		String sql="update board1 set del='y' where num=?";		
		if (board2.getPassword().equals(password)) {
			try {
				pstmt = conn.prepareStatement(sql);  
				pstmt.setInt(1,num);
				result = pstmt.executeUpdate();
			}catch (Exception e) {
				System.out.println(e.getMessage());
			}finally {
				try {
					if (pstmt != null) pstmt.close();
					if (conn != null) conn.close();
				}catch (Exception e) {	}
			}
		} else result = -1; // 암호가 다르다
		return result;
	}
	public int getTotal() {
		int total = 0;
		Connection conn = getConnection();
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String sql="select count(*) from board1";
		try {
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			if (rs.next()) {				
				total = rs.getInt(1);
			}
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}finally {
			try {
				if (rs != null) rs.close();
				if (pstmt != null) pstmt.close();
				if (conn != null) conn.close();
			}catch (Exception e) {	}
		}
		return total;
	}
}