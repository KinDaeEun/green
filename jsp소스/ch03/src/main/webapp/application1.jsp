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
	//표준 경로
	String stdPath = application.getContextPath();
	String realPath = application.getRealPath("/");
	
	application.log("대박 사건");//콘솔에 출력
	%>
	표준 경로 : <%=stdPath %><p>
	실제 경로 : <%=realPath %><p>
</body>
</html>