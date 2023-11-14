package customer;

import java.util.List;

public class CustomerServiceImpl {
	private CustomerDaoImpl cd = new CustomerDaoImpl();

	public int insert(Customer customer) {//customer 입력된 값
		int result = 0;
		//customer2 입력한 key인 ID로 읽어서 중복됐는지 확인
		Customer customer2 = cd.select(customer.getId());
		if(customer2 == null)
			result = cd.insert(customer);
		else
			System.out.println("이미 있는 데이터입니다");
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
		}else
			System.out.println("없는 데이터를 우찌 수정해");
		return result;
	}


	public int delete(String id) {
		int result = 0;
		Customer customer2 = cd.select(id);
		if(customer2 != null)
			result = cd.delete(id);
		else
			System.out.println("없는 데이터는 삭제할 수 없습니다");
		return result;
		
	}


	public List<Customer> list() {
		
		return cd.list();
	}





	
}
