package ch16.service;
import java.io.UnsupportedEncodingException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ch16.dao.MemberDao;
import ch16.model.Member;
public class UpdateAction implements CommandProcess {
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
		
		MemberDao md = MemberDao.getInstance();
		int result = md.update(member);
		request.setAttribute("result", result);
		return "update";
	}
}