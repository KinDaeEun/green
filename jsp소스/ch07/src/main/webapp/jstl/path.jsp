<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<!-- 절대경로 : html에서 http://ip번호:port 여기이고
	    java/jstl에서는 http://ip번호:port/프로젝트 -->
<a href="/ch07/jstl/color.jsp">컬러</a>
<c:redirect url="/jstl/color.jsp"></c:redirect>
</body>
</html>