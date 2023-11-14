<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" import="java.io.*,java.util.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
	request.setCharacterEncoding("utf-8");
	String title = request.getParameter("title");
	String writer = request.getParameter("weiter");
	String content = request.getParameter("content");
	Date date = new Date();
	long time = date.getTime();//파일명을 중복되지 않게 생성
	String fileName = time+".txt";
	String real = application.getRealPath("/WEB-INF/"+fileName);
	FileWriter fw = new FileWriter(real);
	String str = "제목: "+title+"\t\n"+"작성자: "+writer+"\r\n"+content;
	fw.write(str);
	out.println("저장완료");
	fw.close();
	%>
</body>
</html>