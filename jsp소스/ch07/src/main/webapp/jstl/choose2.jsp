<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html><html><head><meta charset="UTF-8">
<title>Insert title here</title></head>
<body>
<h2>인사말</h2>
<c:choose>
	<c:when test="${param.id=='master' }">
		주인님 반갑습니다
	</c:when>
	<c:when test="${param.id eq 'etc' }">
		손님 어세오세요
	</c:when>
	<c:otherwise>꺼져</c:otherwise>
</c:choose>
</body>
</html>