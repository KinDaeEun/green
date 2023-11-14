package com.green.hello;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import javax.annotation.processing.Generated;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomeController {
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home2(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		String formattedDate = dateFormat.format(date);
		model.addAttribute("serverTime", formattedDate);
		return "home";
	}

	@RequestMapping("home")
	public void home(Locale locale, Model model) {
		home2(locale, model);
	}

	@RequestMapping("color")
	public void color(Model model) {
		String[] color = { "red", "orange", "yellow", "green", "blue", "navy", "violet" };
		int num = (int) (Math.random() * 7);
		model.addAttribute("color", color[num]);
	}

	@RequestMapping("gugu")
	public void gugu(Model model) {
		int num = (int) (Math.random() * 8) + 2;
		model.addAttribute("num", num);
	}

	@RequestMapping("colorForm")
	public void colorForm() {
	}

	@RequestMapping("color2")
	public String color2(String color, Model model) {
		model.addAttribute("color", color);
		return "color";
	}
	
	@RequestMapping("guguForm")
	public void guguForm() {
		
	}
	
	@RequestMapping("gugu2")
	public String color2(int num, Model model) {
		model.addAttribute("num", num);
		return "gugu";
	}
	
	
	
	
}