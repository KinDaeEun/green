package com.green.ch06.controller;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.green.ch06.model.Customer;
import com.green.ch06.service.CustomerService;
@Controller
// 클래스 앞에RequestMapping이 있으면 이클래스의 모든 메서드는 
// 앞에 /customer/{id} 공통으로 있는 것으로 적용 된다
@RequestMapping("/customer/{id}")
// 이 session에 있는 editCustomer라는 이름의 데이터를 공유
@SessionAttributes("editCustomer")
public class EditController {
	@Autowired
	private CustomerService cs;
	// @RequestMapping("/customer/{id}/edit")와 같은 의미
	@RequestMapping("/edit")
	public String edit(@PathVariable int id, Model model) {
		Customer customer = cs.select(id);
		model.addAttribute("editCustomer", customer);
		return "redirect:enter";
	}
	// redirect 또는 forward는 다른 url을 실행하는 메서드를 찾음
	// redirect:enter   @Request("/customer/{id}/enter")
	// redirect:/enter  @Request("/enter")
	// @RequestMapping("/customer/{id}/enter")와 같은 의미
	@RequestMapping("/enter")
	public String enter(@ModelAttribute(
			"editCustomer") Customer customer) {
		return "/customer/edit/enter";
	}
// @Valid Customer에 설정된 조건을 체크하여 에러가 있으면 errors에 저장
	@RequestMapping(value = "/enter", params = "event_process")
	public String review(@Valid @ModelAttribute(
			"editCustomer") Customer customer, Errors errors) {
		if (errors.hasErrors()) return "/customer/edit/enter";
		else return "/customer/edit/review";
	}
}
