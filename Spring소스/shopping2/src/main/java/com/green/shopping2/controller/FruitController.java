package com.green.shopping2.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.green.shopping2.model.Item;
import com.green.shopping2.service.ItemService;
@Controller // implement Controller 없어도 됨
public class FruitController {
	@Autowired
	private ItemService is;
	// @PostMapping, @RequetMapping
	@GetMapping("fruitList")
	public String fruitList(Model model) {
		List<Item> fruitList = is.list();
		model.addAttribute("fruitList", fruitList);
		return "fruitList";
	}
	@GetMapping("fruitDetail")
	public String fruitDetail(int itemId,Model model) {
		Item item = is.select(itemId);
		model.addAttribute("item", item);
		return "fruitDetail";
	}
}