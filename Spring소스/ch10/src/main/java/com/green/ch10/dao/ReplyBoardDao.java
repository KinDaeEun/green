package com.green.ch10.dao;

import java.util.List;

import com.green.ch10.model.ReplyBoard;

public interface ReplyBoardDao {
	List<ReplyBoard> list(int bno);
	void insert(ReplyBoard rb);
	void delete(ReplyBoard rb);
	void update(ReplyBoard rb);
}
