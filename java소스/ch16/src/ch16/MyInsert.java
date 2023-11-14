package ch16;
import java.sql.*;
import java.util.Scanner;
public class MyInsert {
	public static void main(String[] args) throws SQLException {
		String driver = "com.mysql.cj.jdbc.Driver";
		String url = "jdbc:mysql://127.0.0.1:3306/test?useSSL=false&serverTimezone=UTC&allowPublicKeyRetrieval=true";
		Connection conn = null;
		Statement stmt = null;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("사번을 입력해주세요");
		int empno = Integer.parseInt(sc.nextLine());
		
		System.out.println("이름을 입력해주세요");
		String ename = sc.nextLine();
		
		System.out.println("업무를 입력해주세요");
		String job = sc.nextLine();
		
		System.out.println("급여를 입력해주세요");
		int sal = Integer.parseInt(sc.nextLine());
		
		System.out.println("부서코드를 입력해주세요");
		int deptno = Integer.parseInt(sc.nextLine());
		
		String sql = String.format("insert into emp(empno,ename,job,sal,deptno) values(%d,'%s','%s',%d,%d) ",empno,ename,job,sal,deptno);
		
		try {
			Class.forName(driver);
			conn = DriverManager.getConnection(url,"root","mysql");
			stmt = conn.createStatement();
			int result = stmt.executeUpdate(sql);
			if(result>0) {
				System.out.println("입력성공");
			}else
				System.out.println("입력실패");
		} catch (Exception e) {
			System.out.println("입력실패:"+e.getMessage());
		}finally {
			conn.close();
			stmt.close();
		}
		sc.close();
	}
}
