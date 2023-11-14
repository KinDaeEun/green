package com.green.tiles;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
	@GetMapping("home/home")
	public void home() {
	}

	@GetMapping("home/first")
	public void first() {
	}

	@GetMapping("test/second")
	public void second() {
	}

	@GetMapping("test/third")
	public void third() {
	}

	@GetMapping("nolay/test1")
	public void nolay() {
	}
}
