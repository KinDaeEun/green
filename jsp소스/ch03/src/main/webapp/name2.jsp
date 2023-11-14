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
	String fighting = korea+"파이팅";
	%>

	<%! //declaration 선언부
		//선언부에는 메서드 또는 전역변수(멤버변수)
	String korea = "대한민국";
	%>
	<%=fighting %>
</body>
</html>