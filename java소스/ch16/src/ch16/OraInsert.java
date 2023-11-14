package ch16;

import java.sql.*;
import java.util.Scanner;

public class OraInsert {
	public static void main(String[] args) throws SQLException {
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
		Connection conn = null;
		Statement stmt = null;
		Scanner sc = new Scanner(System.in);
		System.out.println("부서코드 ?");
		int deptno = Integer.parseInt(sc.nextLine());

		System.out.println("부서명 ?");
		String dname = sc.nextLine();

		System.out.println("근무지 ?");
		String loc = sc.nextLine();

//		String sql = "imsert into dept values("+deptno+",'"+dname+"','"+loc+"')"; (불편)
		String sql = String.format("insert into dept values(%d,'%s','%s')", deptno, dname, loc);
		try {
			Class.forName(driver);
			conn = DriverManager.getConnection(url, "scott", "tiger");
			stmt = conn.createStatement();
			// 조회는 조회한 결과를 저장할 rs가 필요.입력,수정,삭제는 성공한 갯수 int
			int result = stmt.executeUpdate(sql);
			if (result > 0)
				System.out.println("입력성공");
			else
				System.out.println("입력실패");
		} catch (Exception e) {
			System.out.println("입력실패" + e.getMessage());
		} finally {
			conn.close();
			stmt.close();
		}
		sc.close();
	}
}
