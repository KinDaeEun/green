<%@page import="ch10.MemberDao"%>
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
	request.setCharacterEncoding("utf-8");
	String id = request.getParameter("id");
	String password = request.getParameter("password");
	MemberDao md = MemberDao.getInstance(); 
	int result = md.loginChk(id, password);
	if(result > 0 ){
		session.setAttribute("id",id);		
		response.sendRedirect("main.jsp");
	}else if(result == 0){%>
		<script type="text/javascript">
		alert("암호 틀림");
		location.href = "loginForm.jsp";
		</script>
		
<%	}else%>
	<script type="text/javascript">
		alert("아이디 존재하지않음");
		location.href = "loginForm.jsp";
	</script>

</body>
</html>