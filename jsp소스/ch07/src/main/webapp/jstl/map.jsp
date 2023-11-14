<%@page import="java.util.HashMap"%>
<%@page import="java.util.Map"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="e" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
	Map<String, String> menu = new HashMap<>();
	menu.put("아침","떡라면");
	menu.put("점심","김치라면");
	menu.put("저녁","볶은라면");
	request.setAttribute("menu",menu);
	
%>
<jsp:forward page="map_result.jsp"></jsp:forward>
</body>
</html>