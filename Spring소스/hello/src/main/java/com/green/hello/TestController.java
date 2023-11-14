package com.green.hello;

import javax.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestController {

	

	@RequestMapping("member")
	public void member(Member member, Model model) {
		model.addAttribute("member", member);
	}

	@RequestMapping("memberForm")
	public void memberForm() {
	}

	@RequestMapping("addrForm")
	public void addrForm() {
	}

	@RequestMapping("addr")
	public void addr(HttpServletRequest request, Model model) {
		String name = request.getParameter("name");
		String addr = request.getParameter("addr");
		model.addAttribute("addr", addr);
		model.addAttribute("name", name);
	}

	@RequestMapping("addr2")
	public String addr2(String name, String addr, Model model) {
		model.addAttribute("addr", addr);
		model.addAttribute("name", name);
		return "addr";
	}

	@RequestMapping("addr3")
	public void addr3(Person person, Model model) {
		model.addAttribute("person", person);
	}
	
	@RequestMapping("calForm")
	public void calForm() {

	}

	@RequestMapping("cal")
	public void cal(int num1, int num2, Model model) {
		model.addAttribute("plus", num1 + num2);
		model.addAttribute("minus", num1 - num2);
		model.addAttribute("multiply", num1 * num2);
		model.addAttribute("divide", num1 / num2);
	}

	// 현재의 컨트롤러(TestContoller)에서 ArithmeticException발생하면 처리
//	@ExceptionHandler(ArithmeticException.class)
//	public String err1() {
//		return "err1";
//	}
}