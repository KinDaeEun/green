<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%-- ${param.num1 } / ${param.num2 } = ${param.num1/param.num2 } --%>
<h2>사칙연산</h2>
<%
	int num1 = Integer.parseInt(request.getParameter("num1"));
	int num2 = Integer.parseInt(request.getParameter("num2"));
	
	
%>
<c:catch var="e">
	뎃셈 : <%  out.print(num1+" + " +num2+" = "+(num1+num2)); %><p>
	뺄셈 : <%  out.print(num1+" - " +num2+" = "+(num1-num2)); %><p>
	곱셈 : <%  out.print(num1+" * " +num2+" = "+num1*num2); %><p>
	나눗셈 : <%  out.print(num1+" / " +num2+" = "+num1/num2); %><p>
</c:catch>
<c:if test="${e !=null }">
	<p>에러 메시지 : ${e.message }</p>
</c:if>
</body>
</html>