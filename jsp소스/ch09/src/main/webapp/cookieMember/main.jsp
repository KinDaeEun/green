<%@page import="ch09.MemberDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
	String id="";
	Cookie[] cooks = request.getCookies();
	if(cooks == null){
		response.sendRedirect("loginForm.jsp");
	}else {
		for(int i = 0;i<cooks.length;i++){
			if(cooks[i].getName().equals("id")){
				id = cooks[i].getValue();
				break;
			}
		}
		if(id==null || id.equals("")){
			response.sendRedirect("loginForm.jsp");
		}
	}
 	MemberDao md = MemberDao.getInstance();
	String name = md.getName(id); 
%>
<h2><%=id %>님 환영합니다</h2>
<%=name %><p>


<a href="logout.jsp">로그아웃</a>
</body>
</html>