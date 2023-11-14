<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
@import url(common.css);
</style>
</head>
<body>
	<form action="num_result.jsp">
		<table border="1">
			<caption>합계</caption>
			<tr>
				<th>숫자</th>
				<td><input type="number" name="num" required="required"
					autofocus="autofocus"></td>
			</tr>
			<tr>
				<th colspan="2"><input type="submit"></th>
			</tr>
		</table>
	</form>
</body>
</html>