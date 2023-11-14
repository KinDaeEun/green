<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<jsp:useBean id="product" class="ch06.Clothing" scope="request"></jsp:useBean>
<jsp:setProperty property="code" name="product" value="a2"/>
<jsp:setProperty property="name" name="product" value="반팔티"/>
<jsp:setProperty property="price" name="product" value="10000"/>
<jsp:setProperty property="size" name="product" value="20"/>
<jsp:setProperty property="color" name="product" value="black"/>
<jsp:include page="product.jsp"></jsp:include>
</body>
</html>