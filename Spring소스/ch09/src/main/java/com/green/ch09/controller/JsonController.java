package com.green.ch09.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.green.ch09.boardService.BoardService;
import com.green.ch09.model.Board;
@RestController
public class JsonController {
	@Autowired
	private BoardService bs;
	@GetMapping("jsonBoard")
	public List<Board> jsonBoard(Board board) {
		board.setStartRow(1);
		board.setEndRow(10);
		List<Board> list = bs.list(board);
		return list;
	}
}
