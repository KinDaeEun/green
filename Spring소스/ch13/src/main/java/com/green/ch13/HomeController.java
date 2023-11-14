package com.green.ch13;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
	@GetMapping("home")
	public void home() {
	}

	@GetMapping("first")
	public void first() {
	}

	@GetMapping("second")
	public void second() {
	}

	@GetMapping("third")
	public void third() {
	}
	@GetMapping("home1")
	public void home1() {
	}
}
