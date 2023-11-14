package com.green.ch06.service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import javax.annotation.PostConstruct;
import javax.imageio.spi.RegisterableService;

import org.springframework.stereotype.Service;

import com.green.ch06.model.Customer;

@Service
public class CustomerServiceImpl implements CustomerService {
	private Map<Integer,Customer> map = new HashMap<Integer,Customer>();
	private int nextId; //자동으로 1씩 증가하는 값
	@PostConstruct //생성자 생성후에 첫번째 작업
	public void init() {
		register(new Customer("로제","강남","k1@k.com"));
		register(new Customer("보검","신촌","k2@k.com"));
		register(new Customer("은우","부산","k3@k.com"));
		register(new Customer("하니","광주","k4@k.com"));
	}
	private void register(Customer customer) {
		customer.setId(++nextId);
		map.put(customer.getId(), customer);
	}
	@Override
	public Collection<Customer> list() {
		return map.values();
	}
	@Override
	public Customer select(int id) {
		return map.get(id);
	}
	@Override
	public void delete(int id) {
		map.remove(id);
		
	}
}
