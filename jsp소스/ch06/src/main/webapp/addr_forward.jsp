<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<!-- forward는 결과 창을 addr_result.jsp에서 보여주므로 지금 페이지의 내용 안 보여줌 -->
	요청 앞 부분입니다
	<hr>
	<%
	request.setCharacterEncoding("utf-8");
	%>
	<!-- jsp:param 사용하면 값을 변경할 수 있다 -->
	<jsp:forward page="addr_result.jsp">
		<jsp:param value="보바" name="name" />
	</jsp:forward>
	<hr>
	요청 바갂 부분입니다
</body>
</html>