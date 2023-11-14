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
	<form action="ome_result.jsp" method = "post">
		<table border="1">
			<caption>오늘의 메뉴</caption>
			<tr>
				<th>복수 선택</th>
				<td><label for="m1">짜증날 때 짜장</label><input type="checkbox"
					name="menu" id="m1" value="짜증날 때 짜장"><br> <label
					for="m2">우울할 때 우동</label><input type="checkbox" name="menu" id="m2"
					value="우울할 때 우동"><br> <label for="m3">해장에는 짬뽕</label><input
					type="checkbox" name="menu" id="m3" value="해장에는 짬뽕"><br>
					<label for="m4">서비스는 만두</label><input type="checkbox" name="menu"
					id="m4" value="서비스는 만두"></td>
			</tr>
			<tr>
				<th colspan="2"><input type="submit" value="확인"></th>
			</tr>
		</table>
	</form>
</body>
</html>