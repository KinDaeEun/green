package com.green.shopping1.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.green.shopping1.dao.DeptDao;
import com.green.shopping1.model.Dept;

@Service("s2")
public class DeptServiceImpl2 implements DeptService {
	
	@Autowired
	private DeptDao dd;
	
	public List<Dept> list() {
		List<Dept> l = null;
		return l;
	}

}
