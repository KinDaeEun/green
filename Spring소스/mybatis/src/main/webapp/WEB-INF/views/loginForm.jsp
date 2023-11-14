<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="header.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
/* drag & drop */
.drag-over {
	background: yellow;
}

.thumb {
	width: 100px;
	padding: 2px;
	float: left;
}

.thumb>img {
	width: 100%;
}

.thumb>.close {
	position: absolute;
	background: red;
	cursor: pointer;
}

#drop {
	border: 1px solid black;
	width: 300px;
	height: 200px;
	padding: 3px;
}
</style>

</head>
<body>
	<div class="container" align="center">
		<h2 class="text-primary">로그인</h2>
		<form action="login.do" method="post" name="frm">
			<table class="table table-bordered">
				<tr>
					<th>아이디 <i class="bi bi-file-earmark-person icofont-2x"></i></th>
					<td><input type="text" name="id" required="required"
						class="form-control" autofocus="autofocus"></td>
				</tr>
				<tr>
					<th>암호 <i class="bi bi-file-lock2 icofont-2x"></i></th>
					<td><input type="password" name="password" required="required"
						class="form-control"></td>
				</tr>

				<tr>
					<td colspan="2" align="center"><input type="submit"
						value="로그인" class="btn btn-success"></td>
				</tr>
			</table>
		</form>
		<a href="joinForm.do" class="btn btn-info">회원가입</a>
	</div>
</body>
</html>