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
	<c:set var="colors" value="red orange yellow green blue navy violet"></c:set>
	<c:forTokens var="color" items="${colors }" delims=" " varStatus="v">
		<font color="${color }" size="${v.count }">야호</font>
	</c:forTokens>
	<br>
	<c:forTokens var="color" items="${colors }" delims=" ">
		<c:forTokens var="size" items="1 2 3 4 5 6 7" delims=" " varStatus="v">
			<font color="${color }" size="${v.count }">야효</font>
		</c:forTokens>
		<br>
	</c:forTokens>

	<c:forTokens var="size" items="1 2 3 4 5 6 7" delims=" " varStatus="v">
		<c:forTokens var="color" items="${colors }" delims=" ">
			<font color="${color }" size="${size }">야효</font>
		</c:forTokens>
		<br>
	</c:forTokens>

</body>
</html>