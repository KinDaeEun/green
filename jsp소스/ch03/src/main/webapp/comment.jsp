<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2>1부터 100까지 합계</h2>
<% //자바코드
	int sum = 0;
	/*comment시작 sum은 합계 comment종료*/
	for(int i = 1;i<=100;i++){
		sum+= i;
	}
%>

<%=sum %>
<!-- html로 주석: 소스 보기로 확인 가능 -->
<%--jsp로 주석: 소스 보기로 확인 불 가능 --%>
</body>
</html>