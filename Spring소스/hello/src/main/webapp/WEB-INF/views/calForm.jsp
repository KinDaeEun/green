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
	<div class="container" align="center">
		<h2 class="text-primary">사칙 연산</h2>
		<form action="cal">
			<table class="table table-bordered">
				<tr>
					<th class="form-control">첫번째 숫자</th>
					<td><input type="number" name="num1" required="required"
						autofocus="autofocus" class="form-control"></td>
				</tr>
				<tr>
					<th class="form-control">두번째 숫자</th>
					<td><input type="number" name="num2" required="required"
						class="form-control"></td>
				</tr>
				<tr>
					<th colspan="2"><input type="submit" value="입력 완료"
						class="form-control btn btn-success"></th>
				</tr>

			</table>
		</form>
	</div>
</body>
</html>