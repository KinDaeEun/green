package com.green.ch08.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.green.ch08.model.Dept;
import com.green.ch08.service.DeptService;

@Controller
public class DeptController {
	@Autowired
	private DeptService ds;

	@PostMapping("/dept/insertDept")
	public void insertDept(Dept dept, Model model) {
		int result = 0;
		Dept dept2 = ds.select(dept.getDeptno());
		if (dept2 == null)
			result = ds.insert(dept);
		else
			result = -1; // 중복된 부서코드
		model.addAttribute("result", result);
	}

	@RequestMapping(value = "/dept/deptDupChk", produces = "text/html;charset=utf-8")
	@ResponseBody
	public String deptDupChk(int deptno, Model model) {
		String data = "";
		Dept dept = ds.select(deptno);
		if (dept == null)
			data = "사용가능한 부서코드입니다";
		else
			data = "사용중이니 다른 것 사용하세요";
		return data;
	}

	@GetMapping("/dept/insertDeptForm")
	public void insertDeptForm() {
	}

	@GetMapping("/dept/deptList")
	public void deptList(Model model) {
		List<Dept> deptList = ds.list();
		model.addAttribute("deptList", deptList);
	}
	
	@RequestMapping("/dept/updateDeptForm")
	public void updateDeptForm(Model model,int deptno) {
		Dept dept = ds.select(deptno);
		model.addAttribute("dept",dept);
	}
	
	@RequestMapping("/dept/updateDept")
	public void updateDept(Model model,Dept dept) {
		int result = ds.update(dept);
		model.addAttribute("result",result);
	}
	
	@RequestMapping("/dept/deleteDept")
	public void deleteDept(Model model,int deptno) {
		int result = ds.delete(deptno);
		model.addAttribute("result",result);
	}
}


