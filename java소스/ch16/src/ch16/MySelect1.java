package ch16;

import java.sql.*;

public class MySelect1 {
	public static void main(String[] args) throws SQLException {
		String driver = "com.mysql.cj.jdbc.Driver";
		String url = "jdbc:mysql://127.0.0.1:3306/test?useSSL=false&serverTimezone=UTC&allowPublicKeyRetrieval=true";

		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		String sql = "select * from emp";
		try {
			Class.forName(driver);
			conn = DriverManager.getConnection(url, "root", "mysql");
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			while (rs.next()) {
				System.out.println("empno: " + rs.getInt("empno"));
				System.out.println("ename: " + rs.getString("ename"));
				System.out.println("job: " + rs.getString(3));
				System.out.println("================");
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			rs.close();
			stmt.close();
			conn.close();
		}
	}
}
