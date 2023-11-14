package com.green.ch09.boardService;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.green.ch09.boardDao.BoardDao;
import com.green.ch09.model.Board;

@Service
public class BoardServiceImpl implements BoardService{
	@Autowired
	public BoardDao bd;
	public int getTotal(Board board) {
//		return bd.getTotal();
		return bd.getTotal(board);
	}
//	public List<Board> list(int startRow, int endRow) {
//		return bd.list(startRow,endRow);
//	}
	public List<Board> list(Board board) {
		return bd.list(board);
	}
	public int insert(Board board) {
		return bd.insert(board);
	}
	public int getMaxNum() {
		return bd.getMaxNum();
	}
	public void updateReadcount(int num) {
		bd.updateReadcount(num);
	}
	public Board select(int num) {
		return bd.select(num);
	}
	public int update(Board board) {
		return bd.update(board);
	}
	public int delete(int num) {
		return bd.delete(num);
	}
	public void updateStep(Board board) {
		bd.updateStep(board);
	}
}
