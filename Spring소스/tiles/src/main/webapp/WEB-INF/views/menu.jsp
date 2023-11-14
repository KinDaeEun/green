<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="header.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body class="bg-dark">
	<h2 class="text-warning text-center">메뉴</h2>
	<table class="table table-dark"">
		<tr class="text-center">
			<td><a class="text-light" href="${path }/home/home">홈</a></td>
		</tr>
		<tr class="text-center">
			<td><a class="text-light" href="${path }/home/first">트와이스</a></td>
		</tr>
		<tr class="text-center">
			<td><a class="text-light" href="${path }/test/second">프로듀스</a></td>
		</tr>
		<tr class="text-center">
			<td><a class="text-light" href="${path }/test/third">뉴진스</a></td>
		</tr>
		<tr class="text-center">
			<td><a class="text-light" href="${path }/nolay/test1">노레이아웃</a></td>
		</tr>
	</table>
</body>
</html>