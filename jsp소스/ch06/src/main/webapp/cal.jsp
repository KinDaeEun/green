<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
결과<br>
	<jsp:include page="cal_result.jsp">
		<jsp:param value="7" name="num1" />
	</jsp:include>
</body>
</html>