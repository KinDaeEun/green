<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>오늘의 메뉴</h2>
	<p>토룡탕</p>
	<p>용봉탕</p>
	<p>보신탕</p>

	<%
	out.flush(); /* 밑에서 실행 */
	RequestDispatcher rd = request.getRequestDispatcher("import.jsp");
	rd.include(request, response);
	%>

</body>
</html>