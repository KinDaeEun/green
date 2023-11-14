package com.green.ch08.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import com.green.ch08.dao.EmpDao;
import com.green.ch08.model.Emp;

@Service
public class EmpServiceImpl implements EmpService{
	@Autowired
	private EmpDao ed;

	@Override
	public List<Emp> empList(int deptno) {
		return ed.empList(deptno);
	}

	@Override
	public Emp select(int empno) {
		return ed.select(empno);
	}

	@Override
	public List<Emp> list() {
		return ed.list();
	}

	@Override
	public int insert(Emp emp) {
		return ed.insert(emp);
	}

	@Override
	public int update(Emp emp) {
		return ed.update(emp);
	}

	@Override
	public int delete(int empno) {
		return ed.delete(empno);
	}

	@Override
	public List<Emp> allEmpList() {
		return ed.allEmpList();
	}
}
