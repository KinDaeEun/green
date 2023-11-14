<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="header.jsp" %>
<!DOCTYPE html><html><head><meta charset="UTF-8">
<title>Insert title here</title></head><body>
<div class="container">
	<h2 class="text-primary">과일 상세정보</h2>
<table class="table table-bordered">
	<tr><td rowspan="4" align="center">
		<img alt="" src="resources/img/${item.pictureUrl }"></td>
		<th>아이디</th><td>${item.itemId }</td></tr>
	<tr><th>이름</th><td>${item.itemName }</td></tr>
	<tr><th>가격</th><td>${item.price }</td></tr>
	<tr><th>설명</th><td>${item.description}</td></tr>
</table>
	<a href="fruitList.do" class="btn btn-info">과일 목록</a>
	<div id="disp"></div>
</div>
<script type="text/javascript">
	$('#disp').load('fruitList.do table');
</script>
</body>
</html>