package com.green.shopping1.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.green.shopping1.dao.DeptDao;
import com.green.shopping1.model.Dept;

@Service("s1")
public class DeptServiceImpl implements DeptService {
	
	@Autowired
	private DeptDao dd;
	
	public List<Dept> list() {
		return dd.list();
	}

}
