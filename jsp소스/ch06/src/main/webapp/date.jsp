<%@page import="java.util.GregorianCalendar"%>
<%@page import="java.sql.Date"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<% GregorianCalendar gc = new GregorianCalendar();
	String date = String.format("%TF %TT\n", gc, gc);
	out.println(date);
	
%>
</body>
</html>