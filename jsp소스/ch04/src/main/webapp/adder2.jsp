<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" errorPage ="error_j.jsp" %> <!-- 에러발생 하면 처리해주는 페이지 -->
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
	int num1 = Integer.parseInt(request.getParameter("num1"));
	int num2 = Integer.parseInt(request.getParameter("num2"));
	out.println(num1+" + "+" = "+(num1+num2));
	out.println(num1+" - "+" = "+(num1-num2));
	out.println(num1+" * "+" = "+(num1*num2));
	out.println(num1+" / "+" = "+(num1/num2)); %>
</body>
</html>