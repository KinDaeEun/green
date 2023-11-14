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
	<div class="container text-center">
		<h2 class="text-primary">파일 업로드 결과</h2>
		<table class="table table-bordered">
			<tr>
				<th>아이디</th>
				<td>${id }</td>
			</tr>
			<tr>
				<th>이름</th>
				<td>${name }</td>
			</tr>
			<tr>
				<th>파일명</th>
				<td><c:forEach var="fileName" items="${list }">
			${fileName }<br>
					</c:forEach></td>
			</tr>
			<tr>
				<td colspan="2"><c:forEach var="fileName" items="${list }">
						<img alt="" src="resources/upload/${fileName}" width="200">
					</c:forEach></td>
			</tr>
		</table>
	</div>
</body>
</html>