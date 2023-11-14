package customer;

import java.sql.*;
import java.util.*;

public class CustomerDaoImpl { // DB와 연결하여 입력/수정/삭제/조회/목록
//	모든 작업하기 전에 여기서 연결은 처리 
	public Connection getConnection() {
		String driver = "oracle.jdbc.OracleDriver";
		String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
		Connection conn = null;
		try {
			Class.forName(driver);
			conn = DriverManager.getConnection(url, "scott", "tiger");

		} catch (Exception e) {
			System.out.println("연결실패 : " + e.getMessage());
		}
		return conn;
	}

	public Customer select(String id) {
		Customer customer = null;
		Connection conn = getConnection(); // DB연결메서드를 통한 DB사용
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String sql = "select * from customer where id = ?";
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, id);
			rs = pstmt.executeQuery();
			if (rs.next()) {
				customer = new Customer();
				customer.setId(rs.getString("id"));
				customer.setEmail(rs.getString("email"));
				customer.setName(rs.getString("name"));
				customer.setPass(rs.getString("pass"));
				customer.setReg_date(rs.getDate("reg_date"));
			}

		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			try { // throws로 처리하지 않기 위해서 사용
				if (rs != null)
					rs.close();
				if (pstmt != null)
					pstmt.close();
				if (conn != null)
					conn.close();
			} catch (Exception e2) {
			}
		}
		return customer;
	}

	public int insert(Customer customer) {
		int result = 0;
		Connection conn = getConnection();
		PreparedStatement pstmt = null;
		String sql = "insert into customer values(?,?,?,?,sysdate)";
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, customer.getId());
			pstmt.setString(2, customer.getPass());
			pstmt.setString(3, customer.getEmail());
			pstmt.setString(4, customer.getName());
			result = pstmt.executeUpdate();

		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {

			try {
				if (pstmt != null)
					pstmt.close();
				if (conn != null)
					conn.close();
			} catch (Exception e2) {
			}
		}
		return result;
	}

	public int update(Customer customer) {
		int result = 0;
		Connection conn = getConnection();
		PreparedStatement pstmt = null;
		String sql = "update customer set pass = ?,email = ?,name = ? where id = ?";
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, customer.getPass());
			pstmt.setString(2, customer.getEmail());
			pstmt.setString(3, customer.getName());
			pstmt.setString(4, customer.getId());
			result = pstmt.executeUpdate();

		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {

			try {
				if (pstmt != null)
					pstmt.close();
				if (conn != null)
					conn.close();
			} catch (Exception e2) {
			}
		}
		return result;
	}



	public int delete(String id) {
		int result = 0;
		Connection conn = getConnection();
		PreparedStatement pstmt = null;
		String sql = "delete from customer where id =?";
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, id);
			result = pstmt.executeUpdate();

		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {

			try {
				if (pstmt != null)
					pstmt.close();
				if (conn != null)
					conn.close();
			} catch (Exception e2) {
			}
		}
		return result;
	}

	public List<Customer> list() {
		List<Customer> list = new ArrayList<>();
		Connection conn = getConnection(); // DB연결메서드를 통한 DB사용
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String sql = "select * from customer order by id";
		try {
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				Customer customer = new Customer();
				customer = new Customer();
				customer.setId(rs.getString("id"));
				customer.setEmail(rs.getString("email"));
				customer.setName(rs.getString("name"));
				customer.setPass(rs.getString("pass"));
				customer.setReg_date(rs.getDate("reg_date"));
				
				list.add(customer);
			}

		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			try { // throws로 처리하지 않기 위해서 사용
				if (rs != null)
					rs.close();
				if (pstmt != null)
					pstmt.close();
				if (conn != null)
					conn.close();
			} catch (Exception e2) {
			}
		}
		return list;
	}
}