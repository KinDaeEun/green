package ch14.service;
import java.io.UnsupportedEncodingException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import ch14.dao.Board;
import ch14.dao.BoardDao;
public class WriteAction implements CommandProcess {
	public String requestPro(HttpServletRequest request, HttpServletResponse response) {
		try{request.setCharacterEncoding("utf-8");
		} catch (UnsupportedEncodingException e) {	}
		int num = Integer.parseInt(request.getParameter("num"));
		int ref = Integer.parseInt(request.getParameter("ref"));
		int re_level = Integer.parseInt(request.getParameter("re_level"));
		int re_step = Integer.parseInt(request.getParameter("re_step"));
		String subject = request.getParameter("subject");
		String writer = request.getParameter("writer");
		String content = request.getParameter("content");
		String password = request.getParameter("password");
		String pageNum = request.getParameter("pageNum");
		Board board = new Board();
		board.setNum(num);
		board.setRef(ref);
		board.setRe_level(re_level);
		board.setSubject(subject);
		board.setWriter(writer);
		board.setContent(content);
		board.setPassword(password);
		board.setRe_step(re_step); 
		
		BoardDao bd = BoardDao.getInstance();
		int result  = bd.insert(board); 
		
		request.setAttribute("pageNum", pageNum);
		request.setAttribute("result", result);
		return "write";
	}
}