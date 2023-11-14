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
		<form action="login.do">
			<h2 class="text-primary">로그인</h2>
			<table class="table table-bordered">
				<tr>
					<th>아이디 <i class="bi bi-file-earmark-person icofont-2x"></i></th>
					<td><input type="text" name="id" required="required"
						autofocus="autofocus"></td>
				</tr>
				<tr>
					<th>암호<i class="bi bi-file-lock icofont-2x"></i></th>
					<td><input type="password" name="password" required="required"></td>
				</tr>
				<tr>
					<td colspan="2" align="center"><input type="submit"
						class="btn btn-info" value="확인"></td>
				</tr>
			</table>
		</form>
	</div>
</body>
</html>