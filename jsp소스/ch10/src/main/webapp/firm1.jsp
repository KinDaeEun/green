<%@page import="ch10.MemberDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">@import url("common.css");</style>

<%String id = request.getParameter("id"); %>
<script type="text/javascript">
	function wincl() {
		opener.frm.id.value="<%=id%>";
		window.close();
	}
</script>
</head>
<body>
<%
	MemberDao md = MemberDao.getInstance();
	int result = md.confirm(id);
	if(result>0){
%>	
	<h2>아이디가 중복되니 다른 것을 사용하시오</h2>
	<!-- action이 없으면 현재 작업을 다시 실행 -->
	<form action="">
		아이디: <input type="text" name="id" required="required" autofocus="autofocus"><p>
		<input type="submit" value="확인">
	</form>
<%	}else{%>
<h2>사용가능한 아이디입니다</h2>
<button onclick="wincl()">창닫기</button>
<% }%>

</body>
</html>