<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<table class="table table-bordered">
		<tr>
			<th class="form-control">이름</th>
			<td>${member.name }</td>
		</tr>
		<tr>
			<th class="form-control">주소</th>
			<td>${member.addr }</td>
		</tr>
		<tr>
			<th class="form-control">나이</th>
			<td>${member.age }</td>
		</tr>
		<tr>
			<th class="form-control">성별</th>
			<td>${member.gender }</td>
		</tr>
		<tr>
			<th class="form-control">취미</th>
			<td>${member.hobby }</td>
		</tr>

	</table>
</body>
</html>