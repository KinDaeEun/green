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
		<h2 class="text-primary">업로드 결과</h2>
		<table class="table table-striped">
			<tr>
				<th>아이디</th>
				<td class="bg-primary">${member.id }</td>
			</tr>
			<tr>
				<th>이름</th>
				<td class="bg-success">${member.name }</td>
			</tr>
			<tr>
				<th>파일명</th>
				<td class="bg-info">${fileName} ${fileName1 }</td>
			</tr>
			<tr>
				<th>파일크기</th>
				<td class="bg-danger-subtle">${fileSize}</td>
			</tr>
			<tr>
				<th>사진</th>
				<td><img alt="" src="resources/upload/${fileName}" width="300"
					class="img-thumbnail"></td>
			</tr>

		</table>
	</div>
</body>
</html>