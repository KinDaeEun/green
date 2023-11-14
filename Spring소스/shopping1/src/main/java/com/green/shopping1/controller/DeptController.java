package com.green.shopping1.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import com.green.shopping1.model.Dept;
import com.green.shopping1.service.DeptService;

public class DeptController implements Controller {
	@Autowired
	@Qualifier("s1")
	private DeptService ds;

	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
		ModelAndView mav = new ModelAndView();
		List<Dept> deptList = ds.list(); 
		mav.addObject("deptList",deptList);
		mav.setViewName("/WEB-INF/views/dept_list.jsp");
		return mav;
	}

}
