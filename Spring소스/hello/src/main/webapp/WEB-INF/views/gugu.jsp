<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="header.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<div class="container">
		<h2 class="text-primary">구구단 ${num }단</h2>
		<c:forEach var="i" begin="1" end="9">
		${num } * ${i } = ${num*i }<br>
		</c:forEach>
	</div>
</body>
</html>