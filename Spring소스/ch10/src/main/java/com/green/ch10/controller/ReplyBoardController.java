package com.green.ch10.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.green.ch10.model.Board;
import com.green.ch10.model.ReplyBoard;
import com.green.ch10.service.BoardService;
import com.green.ch10.service.ReplyBoardService;
@Controller
public class ReplyBoardController {
	@Autowired
	private BoardService bs;
	@Autowired
	private ReplyBoardService rbs;
	@PostMapping("/rUpdate")
	public String rUpdate(ReplyBoard rb) {
		rbs.update(rb);
		return "redirect:/replyList/bno/"+rb.getBno();
		
	}
	@PostMapping("/rDelete")
	public String rDelete(ReplyBoard rb) {
		
		rbs.delete(rb);
		return "redirect:/replyList/bno/"+rb.getBno();
	}
	@PostMapping("/rInsert")
	public String rInsert(ReplyBoard rb) {
		rbs.insert(rb);
		// 입력이 성공하면 입력된 것을  포함하여 다시 댓글 출력
		return "redirect:/replyList/bno/"+rb.getBno();
	}
	// bno는 게시글 번호 num
	@GetMapping("/replyList/bno/{bno}")
	public String replyList(@PathVariable int bno, Model model) {
		Board board = bs.select(bno);
		// 이 게시글에 있는 모든 댓글을 가지고 와라
		List<ReplyBoard> rbdList = rbs.list(bno);
		model.addAttribute("board",board);
		model.addAttribute("rbdList",rbdList);
		return "replyList";
	}
	
}
