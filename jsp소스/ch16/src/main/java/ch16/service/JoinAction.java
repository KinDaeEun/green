package ch16.service;
import java.io.UnsupportedEncodingException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ch16.dao.MemberDao;
import ch16.model.Member;
public class JoinAction implements CommandProcess {
	public String requestPro(HttpServletRequest request, HttpServletResponse response) {
		try {
			request.setCharacterEncoding("utf-8");
		} catch (UnsupportedEncodingException e) {	}
		String id = request.getParameter("id");
		String password = request.getParameter("password");
		String name = request.getParameter("name");
		String address = request.getParameter("address");
		String tel = request.getParameter("tel");
		
		Member member = new Member();
		member.setId(id);
		member.setPassword(password);
		member.setName(name);
		member.setAddress(address);
		member.setTel(tel);
		
		int result = 0;
		MemberDao md = MemberDao.getInstance();
		Member member2 = md.select(member.getId());
		if (member2 != null) result = -1; // 이미 있는 데이터
		else result = md.insert(member); 
		
		request.setAttribute("result", result);
		return "join";
	}
}