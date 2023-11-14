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
	Cookie[] cookies = request.getCookies();
	if (cookies != null) {
		for (int i = 0; i < cookies.length; i++) {
			if (cookies[i].getName().equals("id")) {
				out.println("쿠키명 : " + cookies[i].getName() + "<br>");
				out.println("쿠키값 : " + cookies[i].getValue() + "<br>");
			}
		}
	}
	%>
</body>
</html>