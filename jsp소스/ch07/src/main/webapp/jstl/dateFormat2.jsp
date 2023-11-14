<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<!-- both : date+time -->
<jsp:useBean id="date" class="java.util.Date"></jsp:useBean>
short : <fmt:formatDate value="${date }" type="both" dateStyle="short" timeStyle="short"/><p>
medium : <fmt:formatDate value="${date }" type="both" dateStyle="medium" timeStyle="medium"/><p>
long : <fmt:formatDate value="${date }" type="both" dateStyle="long" timeStyle="long"/><p>
full : <fmt:formatDate value="${date }" type="both" dateStyle="full" timeStyle="full"/><p>
</body>
</html>