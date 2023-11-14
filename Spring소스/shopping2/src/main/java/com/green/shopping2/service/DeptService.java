package com.green.shopping2.service;
import java.util.List;
import com.green.shopping2.model.Dept;
public interface DeptService {
	List<Dept> list();

	Dept select(int deptno);

}