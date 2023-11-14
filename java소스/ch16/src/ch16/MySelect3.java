package ch16;

import java.sql.*;
import java.util.Scanner;

public class MySelect3 {
	public static void main(String[] args) throws SQLException {
		String driver = "com.mysql.cj.jdbc.Driver";
		String url = "jdbc:mysql://127.0.0.1:3306/test?useSSL=false&serverTimezone=UTC&allowPublicKeyRetrieval=true";
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		System.out.println("보고 싶은 사람을 입력해주세요");
		Scanner sc = new Scanner(System.in);
		String ename = sc.nextLine();
		String sql = "select * from emp where ename = " + "'"+ename+"'";
		try {
			Class.forName(driver);
			conn = DriverManager.getConnection(url, "root", "mysql");
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);

			if (rs.next()) {
				System.out.println("사번: " + rs.getInt(1));
				System.out.println("이름: " + rs.getString(2));
				System.out.println("업무: " + rs.getString(3));
				System.out.println("급여: " + rs.getInt("sal"));
				System.out.println("부서코드: " + rs.getInt("deptno"));
			}

		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			conn.close();
			stmt.close();
			rs.close();

		}
		sc.close();
	}
}
