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
String info = application.getServerInfo(); //WAS정보
int major = application.getMajorVersion(); //Servlet
int minor = application.getMinorVersion();
application.log("console출력");
%>
웹 컨테이너: <%=info %><p>
서블 힛 버전: <%=major %>.<%=minor %>
</body>
</html>