package ch09;

import java.sql.*;
import javax.naming.*;
import javax.sql.*;

public class MemberDao { // Data Access Object
	// Singleton 권장 static 클래스 변수, 정적
	private static MemberDao instance = new MemberDao();

	private MemberDao() {
	}

	// 클래스 메서드
	public static MemberDao getInstance() {
		return instance;
	}

	// Connection pool
	private Connection getConnection() {
		Connection conn = null;
		try {
			Context ctx = new InitialContext();
			DataSource ds = (DataSource) ctx.lookup("java:comp/env/jdbc/OracleDB");
			conn = ds.getConnection();
		} catch (Exception e) {
			System.out.println("연결에러 : " + e.getMessage());
		}
		return conn;
	}

	public int insert(Member member) {
		int result = 0;
		Connection conn = getConnection();
		PreparedStatement pstmt = null;
		String sql = "insert into member1 values(?,?,?,sysdate)";
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, member.getId());
			pstmt.setString(2, member.getPassword());
			pstmt.setString(3, member.getName());
			result = pstmt.executeUpdate();
		} catch (Exception e) { // 입력 처리할 때
			System.out.println(e.getMessage());
		} finally {
			try { // pstmt, conn을 close할 때 에러가 발생
				if (pstmt != null)
					pstmt.close();
				if (conn != null)
					conn.close();
			} catch (Exception e) {}
		}
		return result;
	}
	public int loginChk(String id, String password) {
		int result = 0;
		Connection conn = getConnection();
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String sql = "select password from member1 where id=?";
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, id);
			rs = pstmt.executeQuery();
			if(rs.next()) {
				//DataBase에서 읽은 password
				String dbPass= rs.getString("password");
				if(dbPass.equals(password)) {
					result=1;// id/password가 일치
				}else result = 0; //id 있지만 password는 다름
			}else result = -1; // 해당하는 id가 없다
		} catch (Exception e) { // 입력 처리할 때
			System.out.println(e.getMessage());
		} finally {
			try { // pstmt, conn을 close할 때 에러가 발생
				if (pstmt != null)
					pstmt.close();
				if (conn != null)
					conn.close();
				if (rs != null)
					rs.close();
			} catch (Exception e) {}
		}
		return result;
	}
	
	public String getName(String id) {
		String name = "";
		Connection conn = getConnection();
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String sql = "select name from member1 where id=?";
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, id);
			rs = pstmt.executeQuery();
			if(rs.next()) {
				name = rs.getString("name");
			}
		}catch(Exception e){
			System.out.println(e.getMessage());
		}finally {
			try { // pstmt, conn을 close할 때 에러가 발생
				if (pstmt != null)
					pstmt.close();
				if (conn != null)
					conn.close();
				if (rs != null)
					rs.close();
			} catch (Exception e) {}
		}
		return name;
	}
}
