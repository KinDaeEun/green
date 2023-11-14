package ch16;
import java.sql.*;
import java.util.*;


public class MyUpdate {
	public static void main(String[] args) throws SQLException {
		String driver = "com.mysql.cj.jdbc.Driver";           
		String url = "jdbc:mysql://127.0.0.1:3306/test?useSSL=false&serverTimezone=UTC&allowPublicKeyRetrieval=true";
		Connection conn = null;
		PreparedStatement pstmt = null;
		Scanner sc = new Scanner(System.in);
		System.out.println("수정할 사번?");
		int empno = Integer.parseInt(sc.nextLine());
		
		System.out.println("수정할 이름?");
		String ename = sc.nextLine();
		
		System.out.println("수정할 업무");
		String job = sc.nextLine();
		
		System.out.println("수정할 급여?");
		int sal = Integer.parseInt(sc.nextLine());
		
		String sql = "update emp set ename=?,job=?,sal=? where empno = ?";
		
		try {
			Class.forName(driver);
			conn = DriverManager.getConnection(url,"root","mysql");
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, ename);
			pstmt.setString(2, job);
			pstmt.setInt(3, sal);
			pstmt.setInt(4, empno);
			int result = pstmt.executeUpdate();
			if(result>0)
				System.out.println("수정 성고");
			else
				System.out.println("수정 실패");
		} catch (Exception e) {
			System.out.println("수정 실패"+e.getMessage());
		}finally {
			conn.close();
			pstmt.close();
		}
		sc.close();
	}
}
