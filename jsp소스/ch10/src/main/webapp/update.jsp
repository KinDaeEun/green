<%@page import="ch10.MemberDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ include file="sessionChk.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%request.setCharacterEncoding("utf-8"); %>
<jsp:useBean id="member" class="ch10.Member"></jsp:useBean>
<jsp:setProperty property="*" name="member"/>
<%
	MemberDao md = MemberDao.getInstance();
	int result = md.update(member); 
	if(result>0){%>
		<script type="text/javascript">
			alert("수정 성공");
			location.href="main.jsp";
		</script>
<%	}else{%>
		<script type="text/javascript">
			alert("수정 실패");
			
		</script>
<%	}
%>
</body>
</html>