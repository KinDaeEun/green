package com.green.ch08.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.green.ch08.model.Dept;
import com.green.ch08.model.Emp;
import com.green.ch08.service.DeptService;
import com.green.ch08.service.EmpService;

@Controller
public class EmpController {

	@Autowired
	private EmpService es;
	@Autowired
	private DeptService ds;

	@RequestMapping("/emp/empList")
	public void empList(Model model, int deptno) {
		Dept dept = ds.select(deptno);
		List<Emp> empList = es.empList(deptno);
		model.addAttribute("dept", dept);
		model.addAttribute("empList", empList);
	}

	@RequestMapping("/emp/empSelect")
	public void empSelect(Model model, int empno) {
		Emp emp = es.select(empno);
		model.addAttribute("emp", emp);
	}

	@RequestMapping("/emp/empInsertForm")
	public void empInsertForm(Model model, int deptno) {
		List<Dept> deptList = ds.list();
		List<Emp> empList = es.list();
		model.addAttribute("deptno", deptno);
		model.addAttribute("deptList", deptList);
		model.addAttribute("empList", empList);
	}

	@RequestMapping(value = "/emp/empDupChk", produces = "text/html;charset=utf-8")
	@ResponseBody
	public String empDupChk(int empno, Model model) {
		String data = "";
		Emp emp = es.select(empno);
		if (emp == null)
			data = "사용가능한 사번입니다";
		else
			data = "사용중이니 다른 것 사용하세요";
		return data;
	}

	@RequestMapping("/emp/empInsert")
	public void empInsert(Model model, Emp emp) {
		int result = 0;
		Emp emp2 = es.select(emp.getEmpno());
		if (emp2 == null) {
			result = es.insert(emp);
		} else {
			result = -1;
		}
		model.addAttribute("result", result);
		model.addAttribute("deptno", emp.getDeptno());
	}

	@RequestMapping("emp/empUpdateForm")
	public void empUpdateForm(int empno, Model model) {
		Emp emp = es.select(empno);
		List<Emp> empList = es.list();
		List<Dept> deptList = ds.list();
		model.addAttribute("emp", emp);
		model.addAttribute("empList", empList);
		model.addAttribute("deptList", deptList);
	}

	@RequestMapping("/emp/empUpdate")
	public void empUpdate(Model model, Emp emp) {
		int result = es.update(emp);

		model.addAttribute("result", result);
		model.addAttribute("empno", emp.getEmpno());
	}
	@RequestMapping("emp/empDelete")
	public void empDelete(Model model,int empno) {
		int deptno = es.select(empno).getDeptno();
		int result = es.delete(empno);
		
		model.addAttribute("result", result);
		model.addAttribute("deptno", deptno);
	}
	
	@RequestMapping("/emp/allEmpList")
	public void allEmpList(Model model) {
		List<Emp> list = es.allEmpList();
		model.addAttribute("list",list);
	}

}
