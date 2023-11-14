<%@page import="java.util.ArrayList"%>
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
	ArrayList<String> bug = new ArrayList<>();
	bug.add("지렁이");
	bug.add("굼벵이");
	bug.add("도마벰");
	bug.add("바퀴벌레");
	%>
	<%=bug %><br>
	<%for(int i = 0;i<bug.size();i++){ %>
		<%=bug.get(i) %><br>
	<%} %>
</body>
</html>