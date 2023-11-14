<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@include file="../header.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<div class="container text-center">
		<h2 class="text-primary">회원 목록</h2>
		<table class="table table-striped">
			<tr>
				<th>아이디</th>
				<th>이름</th>
				<th>주소</th>
				<th>이메일</th>
				<th>상세</th>
				<th>편집</th>
			</tr>
			<c:forEach var="customer" items="${customers }">
				<tr>
					<td>${customer.id }</td>
					<td>${customer.name }</td>
					<td>${customer.address }</td>
					<td>${customer.email }</td>
					<td><a href="${path }/customer/${customer.id}">상세</a></td>
					<td><a href="${path }/customer/${customer.id}/edit">편집</a></td>
				</tr>
			</c:forEach>
		</table>
	</div>
</body>
</html>