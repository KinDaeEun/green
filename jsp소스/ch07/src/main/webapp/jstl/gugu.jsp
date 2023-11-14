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
<c:set var="num" value="${param.num }"></c:set>
<c:forEach begin="1" end="9" varStatus="v">
${num } *  ${v.count } = ${num*v.count }<p>
</c:forEach>
</body>
</html>