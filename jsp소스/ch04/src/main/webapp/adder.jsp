<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%try{
		int num1 = Integer.parseInt(request.getParameter("num1"));
		int num2 = Integer.parseInt(request.getParameter("num2"));
		out.println(num1+" + "+" = "+(num1+num2)+"<p>");
		out.println(num1+" - "+" = "+(num1-num2)+"<p>");
		out.println(num1+" * "+" = "+(num1*num2)+"<p>");
		out.println(num1+" / "+" = "+(num1/num2)+"<p>");
	}catch(Exception e){ %>
		<script>
			alert("0으로 나눌 수 없습니다")
			history.back();
			/* history.go(-1); */
		</script>
<% 	}
		%>
	
</body>
</html>