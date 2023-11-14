package ch14.service;

import java.io.UnsupportedEncodingException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ch14.dao.Board;
import ch14.dao.BoardDao;

public class UpdateAction implements CommandProcess {

	@Override
	public String requestPro(HttpServletRequest request, HttpServletResponse response) {
		try {
			request.setCharacterEncoding("utf-8");
		} catch (UnsupportedEncodingException e) {}
		BoardDao bd = BoardDao.getInstance();
		String pageNum = request.getParameter("pageNum");
		String subject = request.getParameter("subject");
		String password = request.getParameter("password");
		String content = request.getParameter("content");
		int num = Integer.parseInt(request.getParameter("num"));
		Board board = new Board();
		board.setNum(num);
		board.setSubject(subject);
		board.setPassword(password);
		board.setContent(content);
		int result  = bd.update(board);
		request.setAttribute("pageNum",pageNum);
		request.setAttribute("board",board);
		request.setAttribute("result",result);

		return "update";
	}

}
