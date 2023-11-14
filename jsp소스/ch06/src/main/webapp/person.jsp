<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<jsp:include page="hobby.jsp"></jsp:include>
<hr>
이름 : 은우<p>
나이 : 31<p>
취미 : 울기<p>
<%@ include file="hobby.jsp" %><p>
취미 : <%=hobby %><p>
</body>
</html>