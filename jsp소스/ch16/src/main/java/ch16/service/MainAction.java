package ch16.service;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import ch16.dao.MemberDao;
import ch16.model.Member;
public class MainAction implements CommandProcess {
	public String requestPro(HttpServletRequest request, HttpServletResponse response) {
		HttpSession session = request.getSession();
		String id = (String) session.getAttribute("id");
		if (id != null) {
			MemberDao md = MemberDao.getInstance();
			Member member  = md.select(id);
			request.setAttribute("member", member);
		}
		return "main";
	}
}