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
		<h2 class="text-primary">게시글 삭제</h2>
		<form action="${path}/delete" method="post">
			<input type="hidden" name="num" value="${num }">
			<input type="hidden" name="pageNum" value="${pageNum }">
			<fieldset class="bg-success-subtle">
				<legend>암호 입력</legend>
				<input type="password" autofocus="autofocus" name="password" required="required" class="form-control">
				<input type="submit" value="확인" class="btn btn-success">						
			</fieldset>
		</form>
	</div>
</body>
</html>