<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
	int sum = 0;
	for (int i = 0; i <= 10; i++) {
		sum += i;
		out.println(i+"까지 합계: "+sum+"<br>");
	}
	%>
	합계:<%=sum%>
</body>
</html>