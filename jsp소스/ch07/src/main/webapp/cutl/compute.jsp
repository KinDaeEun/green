<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="u" tagdir="/WEB-INF/tags" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>제곱</h2>
	<u:compute end="7" var="num" start="3">
		${num }의 제곱은 ${num*num }
	</u:compute>
	<u:compute end="9" var="num" start="1">
		${num }의 세제곱은 ${num*num*num }
	</u:compute>
</body>
</html>