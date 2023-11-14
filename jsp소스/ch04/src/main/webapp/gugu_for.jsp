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
		<%for(int i = 1;i<=9;i++){
			out.println("<th>"+i+"단</th>");
		}
			%>
		
		</tr>
		<%for(int i=1;i<=9;i++){
			out.println("<tr>");
			for (int j = 1; j <= 9; j++) {
				if(j%2==0)
					out.println("<th style = 'background-color: pink'>" +j+" * "+i+" = "+ i*j + "</th>");
				else
					out.println("<th style = 'background-color: violet'>" +j+" * "+i+" = "+ i*j + "</th>");
			}
		}
			%>

		<tr>
	</table>
</body>
</html>