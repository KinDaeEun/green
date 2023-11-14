<%@page import="java.util.stream.*"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.util.*"%>
<!DOCTYPE html><html><head><meta charset="UTF-8">
<title>Insert title here</title></head><body>
<%
	// Set<String> fruits = Stream.of("산딸기", "판딸기",
	//	"죽은 딸기", "알카리딸기","뱀딸기","인삼딸기","집딸기" )
	// .collect(Collectors.toSet());
	Set<String> fruits = new HashSet<String>();
	fruits.add("산딸기"); fruits.add("판딸기"); 
	fruits.add("죽은 딸기"); fruits.add("알카리딸기"); 
	fruits.add("뱀딸기"); fruits.add("인삼딸기"); 
	fruits.add("집딸기"); 
	request.setAttribute("fruits", fruits);
%>
<jsp:forward page="fruit_result.jsp"></jsp:forward>
</body>
</html>