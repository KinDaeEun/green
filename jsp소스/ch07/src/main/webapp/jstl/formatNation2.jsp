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
<jsp:useBean id="date" class="java.util.Date"></jsp:useBean>

서울:<fmt:formatDate value="${date }" type="both"/><br>
<fmt:setTimeZone value="Asia/Hong_Kong"/>
홍콩:<fmt:formatDate value="${date }" type="both"/><br>
<fmt:setTimeZone value="Europ/London"/>
언던:<fmt:formatDate value="${date }" type="both"/><br>
<fmt:setTimeZone value="Ameriac/New_York"/>
뉴욕:<fmt:formatDate value="${date }" type="both"/><br>
</body>
</html>