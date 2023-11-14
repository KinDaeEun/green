<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%-- <c:forEach begin="1" end="7">
	야호
</c:forEach><br>

<c:forEach var="i" begin="1" end="7">
	<font size="${i }">야호</font>
</c:forEach><br>

<c:forEach var="i" begin="1" end="7" step="3">
	<font size="${i }">야호</font>
</c:forEach><br>

<c:forEach var="i" begin="1" end="7" varStatus="v">
	<font size="${i }">야호 ${v.count} ${v.index }
		${v.current }</font>
</c:forEach>

<!-- count 1부터 증가
	 index 0부터 증가
	 current 값 --> --%>

	<c:forEach var="i" begin="1" end="7" varStatus="v">
		<c:set var="test" value="${i}" />
		${i}
	</c:forEach>




	<c:out value="${test}" />

</body>
</html>