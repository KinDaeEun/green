package com.green.ch07;
import javax.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class TestController {
	@GetMapping("logout")
	public void logout(HttpSession session) {
		session.invalidate();
	}
	@GetMapping("aa")
	public void aa() {}
	@GetMapping("loginForm")
	public void loginForm() {}
	@RequestMapping("login")
	public void login(String id, String password,
				Model model, HttpSession session) {
		int result = 0;
		if (id.equals("spring") && password.equals("1234")) {
			session.setAttribute("id", id);
			result = 1;
		}
		model.addAttribute("result", result);
	}
}