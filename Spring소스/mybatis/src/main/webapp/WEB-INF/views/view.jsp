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
		<h2>회원 정보 상세</h2>
		<table class="table table-bordered">
			<tr>
				<th>아이디</th>
				<td class="bg-info">${member.id}</td>
			</tr>
			<tr>
				<th>이름</th>
				<td class="bg-default">${member.name}</td>
			</tr>
			<tr>
				<th>이메일</th>
				<td class="bg-warning">${member.email}</td>
			</tr>
			<tr>
				<th>등록일</th>
				<td class="bg-danger">${member.regdate}</td>
			</tr>
			<tr>
				<th>사진
				<td><img alt="" src="resources/upload/${member.fileName}"
					class="rounded img-thumbnail" width="200"></td>
			</tr>
		</table>
		<a class="btn btn-success" href="main.do">메인</a>
	</div>
</body>
</html>