package com.green.shopping1.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import com.green.shopping1.model.Item;
import com.green.shopping1.service.ItemService;

public class FruitController implements Controller {
	@Autowired
	private ItemService is;
	
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
		ModelAndView mav = new  ModelAndView();
		List<Item> fruitList = is.list();
		mav.addObject("fruitList",fruitList);
		mav.setViewName("/WEB-INF/views/fruit_list.jsp");
		return mav;
	}

}
