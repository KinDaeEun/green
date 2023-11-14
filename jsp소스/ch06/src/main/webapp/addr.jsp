<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	요청 앞 부분입니다
	<hr>
	<%
	request.setCharacterEncoding("utf-8");
	%>
	<!-- jsp:param 사용하면 값을 변경할 수 있다 -->
	<jsp:include page="addr_result.jsp">
		<jsp:param value="보바" name="name" />
	</jsp:include>
	<hr>
	요청 바갂 부분입니다
</body>
</html>