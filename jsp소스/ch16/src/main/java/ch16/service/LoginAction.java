package ch16.service;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import ch16.dao.MemberDao;
import ch16.model.Member;
public class LoginAction implements CommandProcess {
	public String requestPro(HttpServletRequest request, HttpServletResponse response) {
		String id = request.getParameter("id");
		String password = request.getParameter("password");
		MemberDao md = MemberDao.getInstance();
		
		int result = 0;
		Member member  = md.select(id);
		if (member==null || member.getDel().equals("y"))
			result = -1; // 없는 아이디
		else if (member.getPassword().equals(password)) {
				HttpSession session = request.getSession();
				session.setAttribute("id", id);
				result = 1;  // 로그인 성공
			 } 
		
		request.setAttribute("result", result);
		return "login";
	}
}