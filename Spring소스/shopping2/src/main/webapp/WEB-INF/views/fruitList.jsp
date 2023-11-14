<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@include file="header.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2>과일</h2>
	<table class="table table-hover">
		<tr>
			<th>아이디</th>
			<th>이름</th>
			<th>가격</th>
			<th>설명</th>
		</tr>
		<c:forEach var="item" items="${fruitList }">
			<tr>
				<td>${item.itemId }</td>
				<td><a href="fruitDetail.do?itemId=${item.itemId }">${item.itemName }</a></td>
				<td>${item.price }</td>
				<td>${item.description }</td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>