<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="common.css">
</head>
<body>
	<form action="ome_result2.jsp" method="post">
		<table border="1">
			<caption>오늘의 메뉴</caption>
			<tr>
				<th>복수 선택</th>
				<td>
					<select name = "menu" multiple="multiple">
					<option>짜증날 때 짜장</option>
					<option>우울할 때 우동</option>
					<option>해장에는 짬뽕</option>
					<option>서비스는 만두</option>
					</select>
				</td>
			</tr>
			<tr>
				<th colspan="2"><input type="submit" value="확인"></th>
			</tr>
		</table>
	</form>
</body>
</html>