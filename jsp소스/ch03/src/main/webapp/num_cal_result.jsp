<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2>사칙 연산 결과</h2>
<!-- setAttribute로 저장하면 읽을 때는 getAttribte -->
덧셈 : <%=request.getAttribute("plus") %><p>
뺄셈 : <%=request.getAttribute("minus") %><p>
곱셈 : <%=request.getAttribute("multiply") %><p>
나눗셈 : <%=request.getAttribute("divide") %><p>
</body>
</html>