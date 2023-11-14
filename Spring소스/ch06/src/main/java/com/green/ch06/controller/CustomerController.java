package com.green.ch06.controller;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.green.ch06.model.Customer;
import com.green.ch06.service.CustomerService;

@Controller
public class CustomerController {
	@Autowired
	private CustomerService cs;
	
	@GetMapping("/customer")
	public String customer(Model model) {
		Collection<Customer> customers = cs.list();
		model.addAttribute("customers",customers);
		//customer폴더 안에 list.jsp로 반영
		return "/customer/list";
		
	}
	
	@GetMapping("/customer/{id}")
	//@PathVariable는 {}에 들었있는 변수의 값을 받아올 때 사용
	public String detail(@PathVariable int id,Model model) {
		Customer customer = cs.select(id);
		model.addAttribute("customer",customer);
		return "/customer/detail";
	}
	
	@GetMapping("/delete/{id}")
	public String delete(@PathVariable int id,Model model) {
		cs.delete(id);
		return "/customer/delete";
		
	}
}
