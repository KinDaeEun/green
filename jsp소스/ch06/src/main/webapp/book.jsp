<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2>책 소개</h2>
제목: 누구를 위하여 종을 울리나<p>
저자: 하밍웨이<p>
가격: 20000원<p>
<!--action태그  jsp:include는 실행한 결과를 가지고 와서 보여준자 -->
<jsp:include page="date.jsp"></jsp:include><p>
<jsp:include page="date.jsp"></jsp:include><p>

<!-- include지시자를 사용하면 소스를 가지고 와서 같이 컴파일하여 실행한다 -->
 <%@ include file="date.jsp"%>
</body>
</html>