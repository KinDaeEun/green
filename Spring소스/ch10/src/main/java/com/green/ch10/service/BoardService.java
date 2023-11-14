package com.green.ch10.service;

import java.util.List;

import com.green.ch10.model.Board;

public interface BoardService {
	int getTotal(Board board);
//	int getTotal();
	//List<Board> list(int startRow, int endRow);
	List<Board> list(Board board);
	int getMaxNum();
	int insert(Board board);
	void updateReadcount(int num);
	Board select(int num);
	int update(Board board);
	int delete(int num);
	void updateStep(Board board);
}
