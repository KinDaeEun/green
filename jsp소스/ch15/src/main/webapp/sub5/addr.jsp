<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="common.css">
</head>
<body>
<h2>이름과 주소</h2>
<form action="addr_result.jsp">
<fieldset>
<legend>이름</legend>
<input type="text" name="name" required="required" autofocus="autofocus">
</fieldset>
<fieldset>
<legend>주소</legend>
<input type="text" name="addr" required="required">
</fieldset>
<fieldset>
<legend>확인</legend>
<input type="submit">
</fieldset>
</form>
</body>
</html>