package ch16;

import java.sql.*;
import java.util.*;

public class OraDelete {
	public static void main(String[] args) throws SQLException {
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
		Connection conn = null;
		PreparedStatement pstmt = null;
		Scanner sc = new Scanner(System.in);
		System.out.println("삭제할 부서코드는?");
		int deptno = sc.nextInt();
		String sql = "delete from dept where deptno=?";
		try {
			Class.forName(driver);
			conn = DriverManager.getConnection(url,"scott","tiger");
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, deptno);
			int result = pstmt.executeUpdate();
			if(result>0)
				System.out.println("삭제 성공");
			else
				System.out.println("삭제 실페");
		} catch (Exception e) {
			System.out.println("삭제 실패: "+e.getMessage());
		}finally {
			pstmt.close();
			conn.close();
		}
		sc.close();
	}
}
