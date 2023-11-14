<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2>3제곱</h2>
1 ^ 3 = <%=triple(1) %><br>
2 ^ 3 = <%=triple(2) %><br>
3 ^ 3 = <%=triple(3) %><br>
4 ^ 3 = <%=triple(4) %><br>
5 ^ 3 = <%=triple(5) %><br>
6 ^ 3 = <%=triple(6) %><br>

<%! int triple(int x){	
		return x*x*x;
	}
%>

</body>
</html>