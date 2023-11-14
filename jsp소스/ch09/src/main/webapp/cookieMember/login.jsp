<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="ch09.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
	String id = request.getParameter("id");
	String password = request.getParameter("password");
	MemberDao md = MemberDao.getInstance();
	int result = md.loginChk(id, password); 
	if(result>0){
		Cookie cookie = new Cookie("id",id);
		response.addCookie(cookie);
		
		response.sendRedirect("main.jsp");
	}else if( result == 0){%>
		<script type="text/javascript">
		alert("암호가 다릅니다. 다시 암호를 확인하세요")
		history.go(-1);
		</script>
<%	}else{%>
		<script type="text/javascript">
		alert("id 존재하지 않습니다")
		history.go(-1);
		</script>
<%}%>

</body>
</html>