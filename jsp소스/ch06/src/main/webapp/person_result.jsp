<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<jsp:useBean id="person" class="ch06.Person" scope="request"></jsp:useBean><!--  객체 생성 -->
	<h2>개인 정보</h2>
	이름:<jsp:getProperty property="name" name="person"/><p>  <!-- 값 출력 -->
	나이:<jsp:getProperty property="age" name="person"/><p> 
	성별:<jsp:getProperty property="gender" name="person"/><p> 
</body>
</html>