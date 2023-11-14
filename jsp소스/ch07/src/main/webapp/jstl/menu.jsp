<%@page import="java.util.Arrays"%>
<%@page import="java.util.List"%>
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

String[] color = {"red","orange","yellow","green","blue","navy","violet"};
request.setAttribute("color", color);

List<String> menu = Arrays.asList("삼계탕","토룡탕","용봉탕","탕수육","탕탕탕","난자완스");
request.setAttribute("menu",menu);
%>
<jsp:forward page="menu_result.jsp"></jsp:forward>
</body>
</html>