package ch16;

import java.sql.Connection;
import java.sql.DriverManager;

public class MySQLConn1 {
	public static void main(String[] args) {
		String driver = "com.mysql.cj.jdbc.Driver";
		//                          ip번호    포트번호 DB명            
		String url = "jdbc:mysql://127.0.0.1:3306/test?useSSL=false&serverTimezone=UTC&allowPublicKeyRetrieval=true";
		try {
			Class.forName(driver);
			Connection conn = DriverManager.getConnection(url,"root","mysql");
			System.out.println("연결 성공");
			conn.close();
		} catch (Exception e) {
			System.out.println("연결 실패"+e.getMessage());
		}
		
	}
}
