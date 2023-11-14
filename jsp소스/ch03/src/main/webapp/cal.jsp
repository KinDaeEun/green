<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>사칙 연산</h2>
	<form action="cal_result.jsp">
		<table>
			<tr>
				<th>첫번쌔 수:
				<td><input type="number" name="num1">
			</tr>
			<tr>
				<th>두번쌔 수:
				<td><input type="number" name="num2">
			</tr>
			<tr>
				<th colspan="2"><input type="submit"></th>
			</tr>
		</table>
	</form>
</body>
</html>