package com.green.ch10.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.green.ch10.service.BoardService;
import com.green.ch10.service.PageBean;
import com.green.ch10.model.Board;

@Controller
public class BoardController {
	@Autowired
	private BCryptPasswordEncoder bpe;
	@Autowired
	private BoardService bs;
	@GetMapping("/list")
	public String initList() {
		return "redirect:/list/pageNum/1";
	}
	@GetMapping("/list/pageNum/{pageNum}")
	public String list(Board board ,@PathVariable String pageNum, Model model) {
		int rowperpage = 10;
		if (pageNum == null || pageNum.equals(""))
			pageNum = "1";
		int currentPage = Integer.parseInt(pageNum);
		int total = bs.getTotal(board);
		int startRow = (currentPage - 1) * rowperpage + 1;
		int endRow = startRow + rowperpage - 1;
		board.setStartRow(startRow);
		board.setEndRow(endRow);
		//List<Board> list = bs.list(startRow, endRow, search, keyword);
		List<Board> list = bs.list(board);
		PageBean pb = new PageBean(currentPage, rowperpage, total);
		// 페이지별 첫번째 게시글 번호
		int num = total - startRow + 1;
		String[] title = {"작성자","제목","내용","제목+내용"};
		
		model.addAttribute("pageNum", pageNum);
		model.addAttribute("title", title);
		model.addAttribute("board", board);
		model.addAttribute("num", num);
		model.addAttribute("list", list);
		model.addAttribute("pb", pb);
		return "list";
	}
	@GetMapping("/insertForm/num/{num}/pageNum/{pageNum}")
	public String insertForm(@PathVariable int num, @PathVariable String pageNum, Model model) {
		int ref = 0, re_level =0, re_step=0; 	
		if (num != 0) { // 답변글
			Board board = bs.select(num);
			ref = board.getRef();
			re_level = board.getRe_level();
			re_step = board.getRe_step();
		}
		model.addAttribute("num",num);
		model.addAttribute("pageNum",pageNum);
		model.addAttribute("ref",ref);
		model.addAttribute("re_level",re_level);
		model.addAttribute("re_step",re_step);
		return "insertForm";	
	}
	@PostMapping("/insert")
	public String insert(Board board, String pageNum, Model model) {	
		int number = bs.getMaxNum(); // squence사용 안하고 num과 ref처리
		if (board.getNum() != 0) { // 답변글 처리
			// ref가 같고 re_step이 읽은 글의 re_step보다 크면 re_step에 1증가
			bs.updateStep(board);
			board.setRe_level(board.getRe_level()+1);
			board.setRe_step(board.getRe_step()+1);
			// 답변글은 읽은 글의 ref와 답변글의 ref가 같다
		}else board.setRef(number); // 답변글이 아닐때는 num과 ref가 같다
		board.setNum(number);
		
		String encPass=bpe.encode(board.getPassword());
		board.setPassword(encPass);
		int result = bs.insert(board);
		model.addAttribute("pageNum",pageNum);
		model.addAttribute("result",result);
		model.addAttribute("pageNum",pageNum);
		return "insert";
	}
	@GetMapping("/view/num/{num}/pageNum/{pageNum}")
	public String view(@PathVariable int num,@PathVariable String pageNum, Model model) {
		bs.updateReadcount(num);
		Board board = bs.select(num);	
		model.addAttribute("board",board);
		model.addAttribute("num",num);
		model.addAttribute("pageNum",pageNum);
		return "view";
	}
	@GetMapping("/updateForm/num/{num}/pageNum/{pageNum}")
	public String updateForm(@PathVariable int num,@PathVariable String pageNum, Model model) {
		Board board = bs.select(num);
		model.addAttribute("board",board);
		model.addAttribute("num",num);
		model.addAttribute("pageNum",pageNum);
		return "updateForm";
	}
	@PostMapping("/update")
	public void update(Board board, String pageNum, Model model) {
		int result = 0;
		Board board2 = bs.select(board.getNum());
		if (bpe.matches(board.getPassword(),board2.getPassword()))
			result = bs.update(board);
		else result = -1; //암호가 다릅니다
		model.addAttribute("pageNum",pageNum);
		model.addAttribute("result",result);
	}
	@GetMapping("/deleteForm/num/{num}/pageNum/{pageNum}")
	public String deleteForm(@PathVariable int num,@PathVariable String pageNum, Model model) {
		model.addAttribute("num",num);
		model.addAttribute("pageNum",pageNum);
		return "deleteForm";
	}
	
	@RequestMapping("/delete")
	public void delete(Board board, String pageNum, Model model) {
		int result = 0;
		Board board2 = bs.select(board.getNum());
		if (bpe.matches(board.getPassword(),board2.getPassword()))
			 result = bs.delete(board.getNum());
		else result = -1; //암호가 다릅니다
		model.addAttribute("result",result);
		model.addAttribute("pageNum",pageNum);
	}
}
