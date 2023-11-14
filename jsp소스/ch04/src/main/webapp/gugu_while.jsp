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
			
			while (x < 9) {
				x++;
				out.println("<th>" + x + "단</th>");
			}
			%>

		</tr>
		<tr>
			<%
			while (i <= 9) {
				out.println("<tr>");
				while (j <= 9) {
					if (j % 2 == 0)
				    	out.println("<td style = 'background-color: pink'>" + j + " * " + i + " = " + i * j + "</td>");
					else
				    	out.println("<td style = 'background-color: violet'>" + j + " * " + i + " = " + i * j + "</td>");
					j++;				
				}
				i++;
				j=1;
			}
			%>
		</tr>


	</table>
</body>
</html>