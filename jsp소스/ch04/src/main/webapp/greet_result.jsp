<%@page import="java.util.GregorianCalendar"%>
<%@page import="java.io.*"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%! //선언부 전역변수, 메서드
	private PrintWriter pw; //전역변수
	public void jspInit(){ //제일 먼저 실행하는 메서드
		try{
			pw = new PrintWriter(new FileWriter("c:/jsp/jspLog.txt"));
		}catch(Exception e){
			
		}
	}
	public void jspDestroy(){ //서버가 종료 될 때 실행
		if(pw != null)
			pw.close();
	}
%>
<% //scriptlet _jspService()메서드에서 실행할 문장 
	String name = request.getParameter("name");
	GregorianCalendar gc = new GregorianCalendar();
	pw.printf("%TF %TT %s님 안녕\r\n",gc,gc,name);
%>
<%=name %>님 안녕하세요
</body>
</html>