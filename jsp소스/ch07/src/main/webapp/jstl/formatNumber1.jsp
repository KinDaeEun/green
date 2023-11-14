<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>  
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>  
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<fmt:formatNumber value="1000000"></fmt:formatNumber><p>
<fmt:formatNumber value="33.12" pattern=""></fmt:formatNumber><p>
<fmt:formatNumber value="1234.1415" pattern="#,###.##"></fmt:formatNumber><p>
<fmt:formatNumber value="1233.1" pattern="#,###.##"></fmt:formatNumber><p>
<fmt:formatNumber value="1233.1" pattern="#"></fmt:formatNumber><p>
<fmt:formatNumber value="0.5" type="percent"></fmt:formatNumber><p>
<fmt:formatNumber value="123" pattern="#,###.0" type="currency" ></fmt:formatNumber><p>

<fmt:formatNumber value="1.1" pattern="0"  ></fmt:formatNumber>

<c:set var="rating" value='<fmt:formatNumber value="1.1" pattern="0"  ></fmt:formatNumber>'></c:set>
${rating}

</body>
</html>