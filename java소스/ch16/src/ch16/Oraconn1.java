package ch16;

import java.sql.*;

public class Oraconn1 {
	public static void main(String[] args) {
		String driver = "oracle.jdbc.driver.OracleDriver";
		//                               ip주소    포트  sid(service id)
		String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
		try {
			Class.forName(driver); //driver load (활성화)
			//Connection:DB연결
			Connection conn = DriverManager.getConnection(url,"scott","tiger");
			System.out.println("연결 성공 ㅋㅋ");
			conn.close();
		} catch (Exception e) {
				System.out.println("연결 실패: "+e.getMessage());
		}
	}
}
