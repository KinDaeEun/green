package com.green.ch08.dao;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.ui.Model;

import com.green.ch08.model.Emp;

@Repository
public class EmpDaoImpl implements EmpDao{
	@Autowired
	private SqlSessionTemplate sst;

	@Override
	public List<Emp> empList(int deptno) {
		return sst.selectList("empns.empList",deptno);
	}

	@Override
	public Emp select(int empno) {
		return sst.selectOne("empns.select",empno);
	}

	@Override
	public List<Emp> list() {
		return sst.selectList("empns.list");
	}

	@Override
	public int insert(Emp emp) {
		return sst.insert("empns.insert",emp);
	}

	@Override
	public int update(Emp emp) {
		return sst.update("empns.update",emp);
	}

	@Override
	public int delete(int empno) {
		return sst.delete("empns.delete",empno);
	}

	@Override
	public List<Emp> allEmpList() {
		return sst.selectList("empns.allEmpList");
	}


}
