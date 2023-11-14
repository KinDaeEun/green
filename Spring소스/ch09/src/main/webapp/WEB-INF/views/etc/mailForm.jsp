<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="../header.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<div class="container text-center">
		<h2 class="text-primary">메일 작성</h2>
		<form action="mail.do" method="post">
			<table class="table table-hover">
				<tr>
					<th>받는사람</th>
					<td><input type="email" name="email" autofocus="autofocus"
						required="required" class="form-control"></td>
				</tr>
				<tr>
					<th>제목</th>
					<td><input type="text" name="title" required="required"
						class="form-control"></td>
				</tr>
				<tr>
					<th>내용</th>
					<td><textarea rows="5" cols="40" required="required"
							name="content" class="form-control"></textarea></td>
				</tr>
				<tr>
					<td colspan="2" class="table-warning text-center">
						<input type="submit" value="확인" checked="checked" class="btn btn-success">
					</td>
				</tr>
			</table>
		</form>
	</div>
</body>
</html>