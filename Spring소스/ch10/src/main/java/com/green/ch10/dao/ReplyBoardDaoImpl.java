package com.green.ch10.dao;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.green.ch10.model.ReplyBoard;

@Repository
public class ReplyBoardDaoImpl implements ReplyBoardDao{
	@Autowired
	private SqlSessionTemplate sst;
	public List<ReplyBoard> list(int bno) {
		return sst.selectList("rbdns.list", bno);
	}
	@Override
	public void insert(ReplyBoard rb) {
		sst.insert("rbdns.insert", rb);
	}
	@Override
	public void delete(ReplyBoard rb) {
		sst.update("rbdns.delete", rb);
	}
	@Override
	public void update(ReplyBoard rb) {
		sst.update("rbdns.update", rb);
	}
}
