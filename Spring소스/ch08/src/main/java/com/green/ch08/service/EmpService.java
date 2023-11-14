package com.green.ch08.service;

import java.util.List;

import org.springframework.ui.Model;

import com.green.ch08.model.Emp;

public interface EmpService {

	List<Emp> empList(int deptno);

	Emp select(int empno);

	List<Emp> list();

	int insert(Emp emp);

	int update(Emp emp);

	int delete(int empno);

	List<Emp> allEmpList();

}
