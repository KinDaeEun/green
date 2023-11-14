<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isErrorPage="true" %> <!-- 에러처리 하는 페이지 -->
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
불편을 드려서 죄송합니다<br>
더 나은 서비스를 위하여 업크레이드 중입니다
<%=exception.getMessage() %>
</body>
</html>