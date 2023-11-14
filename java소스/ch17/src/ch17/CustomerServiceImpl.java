package ch17;

import java.util.List;

public class CustomerServiceImpl {
	CustomerDaoImpl cd = new CustomerDaoImpl();

	public int insert(Customer customer) {
		int result = 0;
		Customer customer2 = cd.select(customer.getId());
		if (customer2 == null) {
			result = cd.insert(customer);
		} else
			System.out.println("이미 있는 데이터 입니다");
		return result;
	}

	public Customer select(String id) {
		return cd.select(id);

	}

	public int update(Customer customer) {
		int result = 0;

		result = cd.update(customer);

		return result;
	}

//	public int delete(String id, String pass) {
//		int result = 0;
//		Customer customer2 = cd.select(id);
//		
//		if (customer2 != null) {
//			if (!customer2.getPass().equals(pass)) {
//				System.out.println("암호가 틀렸습니다");
//				return result;
//			}
//			result = cd.delete(id);
//		} else
//			System.out.println("없는 계정입니다");
//		return result;
//	}
	public int delete(String id, String pass) {
		int result = 0;
		Customer customer2 = cd.select(id);
		if (!customer2.getPass().equals(pass)) {
			System.out.println("암호가 틀렸습니다");
			return result;
		} else {
			result = cd.delete(id);
		}
		return result;
	}

	public List<Customer> list() {

		return cd.list();
	}

	public int checkPass(String id, String pass) {
		int resultPass = 0;
		Customer customer2 = cd.select(id);
		if (!customer2.getPass().equals(pass)) {
			System.out.println("암호가 틀렸습니다");
			return resultPass;
		} else
			resultPass += 1;
		return resultPass;
	}

}
