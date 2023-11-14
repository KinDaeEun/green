<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
@import url(common.css);
</style>
</head>
<body>
<table border="1">
		<caption>구구단</caption>
		<tr>
			<%
			int x = 0;
			int i = 1;
			int j = 1;
			
			do {
				x++;
				out.println("<th>" + x + "단</th>");
			}while (x < 9);
			%>

		</tr>
		<tr>
			<%
			do{
				out.println("<tr>");
				do{
					if (j % 2 == 0)
				    	out.println("<th style = 'background-color: pink'>" + j + " * " + i + " = " + i * j + "</th>");
					else
				    	out.println("<th style = 'background-color: violet'>" + j + " * " + i + " = " + i * j + "</th>");
					j++;				
				}while (j <= 9) ;
				i++;
				j=1;
			}while (i <= 9) ;
			%>
		</tr>


	</table>
</body>
</html>