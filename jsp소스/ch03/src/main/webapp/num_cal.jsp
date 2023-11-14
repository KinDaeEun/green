<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
난 중간 연산자야 <p> <!-- include 쓰면 여기 까지 보여줌 -->
<% 
out.flush(); /*  out.flush() 쓰면 여기 먼저 실행  */
int num1 = Integer.parseInt(request.getParameter("num1"));
int num2 = Integer.parseInt(request.getParameter("num2"));
request.setAttribute("plus", num1+num2);
request.setAttribute("minus", num1-num2);
request.setAttribute("multiply", num1*num2);
request.setAttribute("divide", num1/num2);
RequestDispatcher rd = request.getRequestDispatcher("num_cal_result.jsp");
rd.include(request, response); 

%>
</body>
</html>