<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>1부터 100까지 합계</h2>
	<%
	//스크립 틀릿 sriptlet
	int sum = 0;
	for(int i = 1;i<=100;i++){
		sum+=i;
	}
	%>
	<!-- 표현식 expression -->
	<%=sum %>
</body>
</html>