<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html><html><head><meta charset="UTF-8">
<title>Insert title here</title></head><body>
<!-- 배열, List, Set, Map데이터는 items로 전달 받는다 -->
<c:forEach var="col" items="${color }">
	<c:forEach var="i" begin="1" end="7">
		<font color="${col }" size="${i }">야호</font>
    </c:forEach><br>
</c:forEach>

<c:forEach var="i" begin="1" end="7">
	<c:forEach var="col" items="${color }">	
		<font color="${col }" size="${i }">야호</font>
	</c:forEach><br>
</c:forEach>

<c:forEach var="col" items="${color }" varStatus="v">
	<font color="${col}">야호 ${v.index } ${v.count }</font>
</c:forEach><br>

<c:forEach var="col" items="${color }" varStatus="v">
	<font color="${col}" size="${v.count }">야호</font>
</c:forEach>

</body>
</html>