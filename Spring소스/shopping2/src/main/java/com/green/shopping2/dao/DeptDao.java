package com.green.shopping2.dao;
import java.util.List;
import com.green.shopping2.model.Dept;
public interface DeptDao {
	List<Dept> list();

	Dept select(int deptno);

}