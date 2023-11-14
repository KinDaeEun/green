<%@page import="ch10.*"%>
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
	MemberDao md = MemberDao.getInstance();
	for(int i = 0;i<228;i++){
		Member member = new Member();
		member.setId("aa"+i);
		member.setPassword("1");
		member.setName("김"+i);
		member.setAddress("A"+i);
		member.setTel("010-3700-2494");
		member.setDel("n");
		md.insert(member);
	}
%>
입력완료
</body>
</html>