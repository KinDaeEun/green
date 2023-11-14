package com.green.ch09.boardService;

import java.util.List;

import com.green.ch09.model.Board;

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
