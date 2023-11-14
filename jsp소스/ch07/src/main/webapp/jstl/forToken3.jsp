<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
@import url("../common.css");
</style>
</head>
<body>
	<c:set var="num" value="1 2 3 4 5 6 7 8 9"></c:set>
	<table border="1">
		<caption>구구단</caption>
		<tr>
			<c:forTokens var="dan" items="${num }" delims=" ">
				<td>${dan }단</td>
			</c:forTokens>
		</tr>

		<c:forTokens var="num1" items="${num }" delims=" ">
			<tr>

				<c:forTokens var="num2" items="${num }" delims=" ">
					<c:if test="${num2%2==0 }">
						<td style=" background: violet">${num2 } * ${num1} = ${num2*num1 }
					</c:if>
					
					<c:if test="${num2%2==1 }">
						<td style=" background: pink">${num2 } * ${num1} = ${num2*num1 }
					</c:if>

				</c:forTokens>
			</tr>
		</c:forTokens>
	</table>

</body>
</html>