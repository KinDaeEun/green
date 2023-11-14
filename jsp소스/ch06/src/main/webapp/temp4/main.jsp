<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
	String pgm = request.getParameter("pgm");
	if (pgm == null || pgm.equals("")) {
		pgm = "/temp1/home.jsp";
	} else if (pgm.equals("/cal")) {
		pgm += ".html";
	} else
		pgm += ".jsp";
	%>
	<header><jsp:include page="menu.jsp"></jsp:include></header>
	<section><jsp:include page="<%=pgm%>"></jsp:include></section>
	<footer><jsp:include page="footer.jsp"></jsp:include></footer>

</body>
</html>