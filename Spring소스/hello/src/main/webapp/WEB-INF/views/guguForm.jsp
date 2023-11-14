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
	<form action="gugu2">
		<c:forEach begin="1" end="9" varStatus="v">
			<label><input type="radio" value="${v.count }" name="num" required="required">${v.count }</label><br>
		</c:forEach>
		<input type="submit">

	</form>
</body>
</html>