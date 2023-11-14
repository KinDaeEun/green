package com.green.ch08.service;
import java.util.List;
import com.green.ch08.model.Dept;
public interface DeptService {
	List<Dept> list();
	Dept select(int deptno);
	int insert(Dept dept);
	int update(Dept dept);
	int delete(int deptno);

}