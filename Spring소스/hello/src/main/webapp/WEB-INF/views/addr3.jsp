<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="header.jsp" %>
<!DOCTYPE html><html><head><meta charset="UTF-8">
<title>Insert title here</title></head><body>
<div class="container" align="center">
	<h2>이름과 주소</h2>
<table class="table table-bordered">
	<tr><th>이름</th><td class="text-bg-primary">${person.name }</td></tr>
	<tr><th>주소</th><td class="text-bg-warning">${person.addr }</td></tr>
</table>
</div>
</body>
</html>