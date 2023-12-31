package com.green.ch09.boardDao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.green.ch09.model.Board;

@Repository
public class BoardDaoImpl implements BoardDao{
	@Autowired
	public SqlSessionTemplate sst;
	public int getTotal(Board board) {
		return sst.selectOne("boardns.getTotal",board);
	}
//	public List<Board> list(int startRow, int endRow) {
//		Map<String, Integer> map = new HashMap<String, Integer>();
//		map.put("startRow", startRow);
//		map.put("endRow", endRow);
//		return sst.selectList("boardns.list", map);
//	}
	public List<Board> list(Board board) {
		return sst.selectList("boardns.list", board);
	}
	public int getMaxNum() {
		return sst.selectOne("boardns.getMaxNum");
	}
	public int insert(Board board) {
		return sst.insert("boardns.insert",board);
	}
	public void updateReadcount(int num) {
		sst.update("boardns.updateReadcount",num);
	}
	public Board select(int num) {
		return sst.selectOne("boardns.select",num);
	}
	public int update(Board board) {
		return sst.update("boardns.update",board);
	}
	public int delete(int num) {
		return sst.update("boardns.delete",num);
	}
	public void updateStep(Board board) {
		sst.update("boardns.updateStep",board);
	}

}
