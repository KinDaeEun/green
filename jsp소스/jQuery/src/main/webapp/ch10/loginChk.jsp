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
	이름 : ${param.name }이고
	<c:choose>
		<c:when test="${param.name == 'admin' && param.pass == '1234' }">
			당신은 권한이 있습니다
		</c:when>
		<c:otherwise>
			꺼져 권한이 없어
		</c:otherwise>
	</c:choose>
</body>
</html>