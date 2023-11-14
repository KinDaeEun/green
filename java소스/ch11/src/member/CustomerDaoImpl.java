package member;
import java.util.*;

public class CustomerDaoImpl { 
	private Map<String,Customer>map = new HashMap<>();

	public Customer select(String id) {
		return map.get(id);
	}

	public int insert(Customer customer) {
		map.put(customer.getId(), customer);
		return 1;
	}


	public int update(Customer customer) {
		map.put(customer.getId(), customer);
		return 1;
	}

	public int delete(String id) {
		map.remove(id);
		return 1;
	}

	public Collection<Customer> list() {
		
		return map.values();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
//	//key는 id이고 값은 customer객체
//	private Map<String, Customer> map = new HashMap<>();
//	
//	public Customer select(String id) {	
//		return map.get(id); //get(key) 결과는 customer 반환
//	}
//
//	public int insert(Customer customer) {
//		map.put(customer.getId(), customer);
//		return 1;
//	}
//
//	public int update(Customer customer) {
//		map.put(customer.getId(), customer); //key가 같으면 덮어쓴다
//		return 1;
//	}
//
//	public int delete(String id) {
//		map.remove(id); //key가 같으면 덮어쓴다
//		return 1;
//
//	}
//	public Collection<Customer> list() {
//		return map.values(); // map에 있는 모든 값만 읽을 때 사용
//	}
}
