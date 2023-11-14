<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%request.setCharacterEncoding("utf-8"); %>
<h2>회원 가입정보</h2>
이름: <%= request.getParameter("name") %><br>
아이디: <%=request.getParameter("id") %><br>
암호: <%=request.getParameter("pass") %><br>
성별: <%=request.getParameter("gender") %><br>
취미: <%=request.getParameter("hobby") %><br>
</body>
</html>