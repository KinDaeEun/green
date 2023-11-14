package ch16;

import java.sql.*;

public class OraSelect1 {
	public static void main(String[] args) throws SQLException {
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
		Connection conn = null; // DB연결
		Statement stmt = null;// SQL을 실행하는 객체
		ResultSet rs = null;// 조회한 결과를 저장하는 객체
		String sql = "select * from dept order by deptno";// 실행
		try {
			Class.forName(driver);// driver load
			conn = DriverManager.getConnection(url, "scott", "tiger");//DB연결
			stmt = conn.createStatement();// 연결된 객체에 sql실행할 객체 생성
			rs = stmt.executeQuery(sql);// sql를 실행해서 조회하고 그 결과를 rs에 저장
			while (rs.next()) {// 저장된 데이터를 다음 것을 하나씩 읽는다
				System.out.println("부서코드: " + rs.getInt("deptno"));
				System.out.println("부서명: " + rs.getString(2));//숫자로 대신 가능
				System.out.println("근무지: " + rs.getString(3));
				System.out.println("====================");
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
