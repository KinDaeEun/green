package ch16;
import java.sql.*;
import java.util.*;
public class OraUpdate {
	public static void main(String[] args) throws SQLException {
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
		Connection conn = null; 
		PreparedStatement pstmt = null;
		Scanner sc = new Scanner(System.in);
		System.out.println("수정할 부서코드");
		int deptno = Integer.parseInt(sc.nextLine());
		
		System.out.println("수정할 부서명");
		String dname = sc.nextLine();
		
		System.out.println("수정할 근무지");
		String loc = sc.nextLine();
		
//		String sql = String.format("update dept dname = '%s',loc = '%s' where deptno = '%d'", dname,loc,deptno); 불편
		String sql = "update dept set dname=?,loc=? where deptno=?";
		try {
			Class.forName(driver);
			conn=DriverManager.getConnection(url,"scott","tiger");
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, dname);
			pstmt.setString(2, loc);
			pstmt.setInt(3, deptno);
			int result = pstmt.executeUpdate();
			if(result>0)
				System.out.println("수정 되었습니다");
			else
				System.out.println("똑바로 해");
		} catch (Exception e) {
			System.out.println("수정 실패"+e.getMessage());
		}finally {
			pstmt.close();
			conn.close();
		}
		
		sc.close();
	}
}
