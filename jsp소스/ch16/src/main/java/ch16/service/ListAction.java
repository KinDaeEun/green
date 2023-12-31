package ch16.service;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import ch16.dao.MemberDao;
import ch16.model.Member;
public class ListAction implements CommandProcess {
	public String requestPro(HttpServletRequest request, HttpServletResponse response) {
		final int ROW_PER_PAGE = 10;
		final int PAGE_PER_BLOCK = 10;
		String pageNum = request.getParameter("pageNum");
		if (pageNum == null || pageNum.equals(""))
			pageNum = "1";
		int currentPage = Integer.parseInt(pageNum);
		
		//시작번호	(페이지번호 - 1) * 페이지당 갯수+ 1				
		int startRow = (currentPage - 1)*ROW_PER_PAGE + 1;
		//끝번호 	시작번호 + 페이지당개수 - 1			
		int endRow = startRow + ROW_PER_PAGE - 1; 
		MemberDao md = MemberDao.getInstance();
		int total = md.getTotal();  
		int totalPage=(int)Math.ceil((double)total/ROW_PER_PAGE);
		//현재페이지 - (현재페이지 - 1)%10
		int startPage = currentPage-(currentPage - 1)%PAGE_PER_BLOCK;
		//시작페이지 + 블록당페이지 수 -1
		int endPage = startPage + PAGE_PER_BLOCK - 1;
		//endPage는 총페이지 보다 크면 안된다	
		if (endPage > totalPage) endPage = totalPage;

		List<Member> list = md.list(startRow, endRow); 
				
		request.setAttribute("list", list);
		request.setAttribute("startPage", startPage);
		request.setAttribute("endPage", endPage);
		request.setAttribute("totalPage", totalPage);
		request.setAttribute("PAGE_PER_BLOCK", PAGE_PER_BLOCK);

		return "list";
	}
}