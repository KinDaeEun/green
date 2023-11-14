package member;

import java.util.Collection;


public class CustomerServiceImpl {
	private static CustomerDaoImpl cd = new CustomerDaoImpl();

	public int insert(Customer customer) {
		int result = 0;
		Customer customer2 = cd.select(customer.getId());
		if(customer2 == null) {
			result = cd.insert(customer);
		}else
			System.out.println("있는 id입니다");
		return result;
	}

	public Customer select(String id) {
		return cd.select(id);

	}

	public int update(Customer customer) {
		int result = 0;
		Customer customer2 = cd.select(customer.getId());
		if(customer2 != null) {
			result = cd.update(customer);
		}
		return result;
	}

	public int delete(String id) {
		int result = 0;
		Customer customer2 = cd.select(id);
		if(customer2 != null)
			result = cd.delete(id);
		return result;
	}

	public Collection<Customer> list() {
		return cd.list();
	}




	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
//	private static CustomerDaoImpl cd = new CustomerDaoImpl();
//
//	public int insert(Customer customer) {
//		int result = 0;
//		//map에 입력한 id로 데이터를 읽어서 있으면 이미 있는 아이디이니 다른 아이디
//		//없으면 데이터를 map에추가
//		//customer 회원가입할려구 요청한 데이터, customer2 메모리에서 읽은 데이터
//		Customer customer2 = cd.select(customer.getId());
//		if(customer2 == null)
//			result = cd.insert(customer);
//		else
//			System.out.println("이미 있는 아이디이니 다른 아이디를 사용하세요");
//		return result;
//	}
//
//	public Customer select(String id) {
//		return cd.select(id);
//	}
//
//	public int update(Customer customer) {
//		int result = 0;
//		Customer customer2 = cd.select(customer.getId());
//		if(customer2 != null)
//			result = cd.update(customer);
//		else
//			System.out.println("없는 데이터는 수정 못합니다");
//		return result;
//	}
//	public int delete(String id) {
//		int result = 0;
//		Customer customer2 = cd.select(id);
//		if(customer2 != null)
//			result = cd.delete(id);
//		else
//			System.out.println("없는 데이터는 삭제 못합니다");
//		return result;
//	}
//
//	public Collection<Customer> list() {
//		return cd.list();
//	}
}
