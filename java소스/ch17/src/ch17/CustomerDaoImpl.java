package ch17;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class CustomerDaoImpl {
	public Connection getConnecton() {
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
		Connection conn = null;
		try {
			Class.forName(driver);
			conn = DriverManager.getConnection(url, "scott", "tiger");

		} catch (Exception e) {
			System.out.println("연결 실패: " + e.getMessage());
		}
		return conn;
	}

	public Customer select(String id) {
		Customer customer = null;
		String sql = "select * from customer where id = ?";
		Connection conn = getConnecton();
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, id);
			rs = pstmt.executeQuery();
			if (rs.next()) {
				customer = new Customer();
				customer.setId(rs.getString("id"));
				customer.setPass(rs.getString("pass"));
				customer.setName(rs.getString("name"));
				customer.setEmail(rs.getString("email"));
				customer.setReg_date(rs.getDate("reg_date"));
			}

		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			try {
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
		String sql = "insert into customer values(?,?,?,?,sysdate)";
		Connection conn = getConnecton();
		PreparedStatement pstmt = null;
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, customer.getId());
			pstmt.setString(2, customer.getPass());
			pstmt.setString(3, customer.getName());
			pstmt.setString(4, customer.getEmail());
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
		String sql = "update customer set pass = ?,name = ?,email = ?";
		Connection conn = getConnecton();
		PreparedStatement pstmt = null;
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, customer.getPass());
			pstmt.setString(2, customer.getName());
			pstmt.setString(3, customer.getEmail());
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
		String sql = "delete from customer where id = ?";
		Connection conn = getConnecton();
		PreparedStatement pstmt = null;
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
		List <Customer> list = new ArrayList<>();
		Connection conn = getConnecton();
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String sql = "select * from customer";
		try {
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				Customer customer = new Customer();
				customer.setId(rs.getString("id"));
				customer.setPass(rs.getString("pass"));
				customer.setName(rs.getString("name"));
				customer.setEmail(rs.getString("email"));
				customer.setReg_date(rs.getDate("reg_date"));
				
				list.add(customer);
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}finally {
			try { // throws로 처리하지 않기 위해서 사용
				if (rs != null)
					rs.close();
				if (pstmt != null)
					pstmt.close();
				if (conn != null)
					conn.close();
			} catch (Exception e2) {}
		}
		return list;
	}

}