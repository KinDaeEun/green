<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@include file="header.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<table>
		<tr>
			<th>부서번호</th>
			<th>부서명</th>
			<th>근무지</th>
		</tr>
		<c:forEach var="dept" items="${ deptList}">
			<tr>
				<td>${dept.deptno }</td>
				<td>${dept.dname }</td>
				<td>${dept.loc }</td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>