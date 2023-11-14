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
	//                         속성    값  
	Cookie cookie = new Cookie("id","세영");
	//브라우저를 닫으면 쿠키 사용 종료
	//cookie.setMaxAge(60*2);//초단위 2분
	//cookie.setMaxAge(0);//쿠키 삭제한 효과
	cookie.setValue("로제");//쿠키값 수정
	response.addCookie(cookie);//쿠키를 client에 전송
%>
<h2>쿠키 생성</h2>
<a href="cookieUse.jsp">쿠키 값 확인</a>
</body>
</html>