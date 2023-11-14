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
<!-- jsp:include 또는 c:direct와 유사하지만
c:param을 사용하여 변수와 값을 지정할 수 있다 -->
<c:import url="gugu.jsp">
	<c:param name="num" value="7"></c:param>
</c:import>
</body>
</html>