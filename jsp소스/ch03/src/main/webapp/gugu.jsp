<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

<style type="text/css">
@import url("common.css");
</style>
</head>
<body>
<h2>구구단 선택</h2>
	<form action="gugu_result.jsp">
		<table>
			<tr>
				<th>번호 선택</th>
				<td><select name = "num">
						<option>2
						<option>3
						<option>4
						<option>5
						<option>6
						<option>7
						<option>8
						<option>9
				</select></td>
			</tr>
			<tr>
				<th colspan="2"><input type="submit" value="확인"></th>
			</tr>
		</table>
	</form>
</body>
</html>