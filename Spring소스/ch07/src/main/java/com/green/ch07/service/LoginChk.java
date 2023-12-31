package com.green.ch07.service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

public class LoginChk extends HandlerInterceptorAdapter {
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
	HttpSession session = request.getSession();
	if(session.getAttribute("id") == null) {
		response.sendRedirect("loginForm.do");
		return false;
	}
		return true;
	}
}
