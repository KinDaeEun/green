package ch14.service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ch14.dao.Board;
import ch14.dao.BoardDao;

public class ContentAction implements CommandProcess {

	@Override
	public String requestPro(HttpServletRequest request, HttpServletResponse response) {
		String pageNum = request.getParameter("pageNum");
		int num = Integer.parseInt(request.getParameter("num"));
		BoardDao bd = BoardDao.getInstance();
		bd.readCountUpdate(num); 
		Board board = bd.select(num); 
		request.setAttribute("board", board);
		request.setAttribute("pageNum",pageNum);
		return "content";
	}

}
