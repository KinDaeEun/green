<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%! 
	String name = "제니";
	String getName(){
		return "피프티피부티";
	}
%>
<%=name%><p>
<%=getName() %>
</body>
</html>