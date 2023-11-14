package com.green.ch10.service;

import java.util.List;

import com.green.ch10.model.ReplyBoard;

public interface ReplyBoardService {
	List<ReplyBoard> list(int bno);
	void insert(ReplyBoard rb);
	void delete(ReplyBoard rb);
	void update(ReplyBoard rb);
}
