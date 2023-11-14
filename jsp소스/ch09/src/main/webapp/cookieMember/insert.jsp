<%@page import="ch09.MemberDao"%>
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
	request.setCharacterEncoding("utf-8");
	
%>
<jsp:useBean id="member" class="ch09.Member" scope="request"></jsp:useBean>
<jsp:setProperty property="*" name="member" />
<%
	MemberDao md = MemberDao.getInstance();
	int result = md.insert(member);
	if(result>0){	
%>
	<script type="text/javascript">
	alert("와우!회원 가입됐다")
	location.href = "loginForm.jsp";
	</script>

<%}else{%>
	<script type="text/javascript">
	alert("의이그!! 다시해")
	history.go(-1);
	</script>
<% }%>
</body>
</html>