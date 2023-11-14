package com.green.shopping2.controller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.green.shopping2.model.Dept;
import com.green.shopping2.service.DeptService;
@Controller
public class DeptController {
	@Autowired
	private DeptService ds;
	
	@RequestMapping("deptList")
	public String deptList(Model model) {
		List<Dept> deptList = ds.list();
		model.addAttribute("deptList", deptList);
		return "deptList";
	}
	
	@GetMapping("deptDetail")
	public String deptDetail(int deptno,Model model) {
		Dept dept = ds.select(deptno);
		model.addAttribute("dept",dept);
		return "deptDetail";
		
	}
}
