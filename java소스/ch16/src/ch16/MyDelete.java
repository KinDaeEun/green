package ch16;

import java.sql.*;
import java.util.Scanner;

public class MyDelete {
	public static void main(String[] args) throws SQLException {
		String driver = "com.mysql.cj.jdbc.Driver";
		String url = "jdbc:mysql://127.0.0.1:3306/test?useSSL=false&serverTimezone=UTC&allowPublicKeyRetrieval=true";
		Connection conn = null;
		PreparedStatement pstmt = null;
		Scanner sc = new Scanner(System.in);
		System.out.println("삭제할 사번?");
		int empno = sc.nextInt();
		String sql = "delete from emp where empno =? ";
		try {
			Class.forName(driver);
			conn = DriverManager.getConnection(url,"root","mysql");
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, empno);
			int result = pstmt.executeUpdate();
			if(result>0)
				System.out.println("삭제 성공");
			else
				System.out.println("삭제 실패");
		} catch (Exception e) {
			System.out.println("삭제 실패: "+e.getMessage());
		}finally {
			pstmt.close();
			conn.close();
		}
		sc.close();
	}
}
