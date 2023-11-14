package ch14.service;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ch14.dao.Board;
import ch14.dao.BoardDao;

public class ListAction implements CommandProcess {

	@Override
	public String requestPro(HttpServletRequest request, HttpServletResponse response) {
		final int ROW_PER_PAGE = 10;//한페이지의 댓글 갯수
		final int PAGE_PER_BLOCK = 10;//한 블록의 페이지 갯수
		String pageNum = request.getParameter("pageNum");
		if (pageNum == null || pageNum.equals(""))
			pageNum = "1";
		int currentPage = Integer.parseInt(pageNum);//페이지 번호

		//	시작번호	(페이지번호 - 1) * 페이지당 갯수+ 1				
		int startRow = (currentPage - 1) * ROW_PER_PAGE + 1;//해당 페이지의 첫 댓글
		//  끝번호 	시작번호 + 페이지당개수 - 1			
		int endRow = startRow + ROW_PER_PAGE - 1;

		BoardDao bd = BoardDao.getInstance();
		int total = bd.getTotal(); //총 댓글 수
		int totalPage = (int) Math.ceil((double) total / ROW_PER_PAGE); //총 페이지 수
		//	현재페이지 - (현재페이지 - 1)%10
		int startPage = currentPage - (currentPage - 1) % PAGE_PER_BLOCK;//한 블록의 사작 페이지
		//	시작페이지 + 블록당페이지 수 -1
		int endPage = startPage + PAGE_PER_BLOCK - 1;
		//  endPage는 총페이지 보다 크면 안된다	
		if (endPage > totalPage)
			endPage = totalPage;
		List<Board> list = bd.list(startRow, endRow);
		System.out.println(startPage);
		System.out.println(endPage);

		
		//jsp에 보낼 데이터를 request에 setting해야 한다
		request.setAttribute("list",list);
		request.setAttribute("currentPage",currentPage);
		request.setAttribute("startPage",startPage);
		request.setAttribute("endPage",endPage);
		request.setAttribute("PAGE_PER_BLOCK",PAGE_PER_BLOCK);
		request.setAttribute("totalPage",totalPage);
		
		return "list";
	}

}
