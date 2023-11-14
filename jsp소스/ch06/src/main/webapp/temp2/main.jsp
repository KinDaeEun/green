<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
@import url("../common.css");
header{background: yellow; height:30px;}
nav{float:left;width:20%;height:300px; background: violet}
section{float:right;width:80%;height:300px; background: pink;}
</style>
<%
String pgm = request.getParameter("pgm");
if (pgm == null || pgm.equals(""))
	pgm = "home.jsp";
else
	pgm += ".jsp";

%>
</head>
<body>
<header><jsp:include page="header.jsp"></jsp:include></header>

<nav><jsp:include page="menu.jsp"></jsp:include></nav>
<section><jsp:include page="<%=pgm%>"></jsp:include></section>
<footer><jsp:include page="footer.jsp"></jsp:include></footer>
	
</body>
</html>