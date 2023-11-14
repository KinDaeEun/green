package com.green.hello;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

//에러 컨트롤러에서 공통으로 처리할 메서드를 모아 놓은 것
@ControllerAdvice
public class CommonController {
	@ExceptionHandler(Exception.class)
	public String err(Exception e,Model model) {
		model.addAttribute("e",e);
		return "err2";
	}
}
