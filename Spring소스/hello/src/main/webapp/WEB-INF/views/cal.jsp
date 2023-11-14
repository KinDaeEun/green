<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ include file="header.jsp" %>
<!DOCTYPE html><html><head><meta charset="UTF-8">
<title>Insert title here</title></head><body>
<div class="container">
	<h2 class="text-primary">사칙연산 결과</h2>
<table class="table table bordered">
	<tr><th width="20%"><span class="form-control bg-success-subtle">
		덧셈</span></th>
		<td><span class="form-control bg-primary-subtle">
			${plus }</span></td></tr>
	<tr><th><span class="form-control bg-info">뺄셈</span></th>
		<td><span class="form-control bg-secondary">
			${minus }</span></td></tr>
	<tr><th><span class="form-control bg-warning-subtle">곱셈</span></th>
		<td><span class="form-control bg-defsult">
			${multiply }</span></td></tr>
	<tr><th><span class="form-control bg-danger-subtle">나눗셈</span></th>
		<td><span class="form-control bg-warning">
			${divide }</span></td></tr>
</table>
</div>
</body>
</html>