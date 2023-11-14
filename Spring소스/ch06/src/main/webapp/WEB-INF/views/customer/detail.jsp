<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="../header.jsp" %>
<!DOCTYPE html><html><head><meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript">
	function del() {
		let cf = confirm("정말로 삭제하시겠습니까 ?");
		if (cf) location.href="${path}/delete/${customer.id}";
		else alert("삭제가 취소 되었습니다");
	}
</script></head><body>
<div class="container text-center">
	<h2 class="text-primary">고객 정보 상세</h2>
<table class="table table-bordered table-hover">
	<tr><th>아이디</th><td>${customer.id }</td></tr>
	<tr><th>이름</th><td>${customer.name }</td></tr>
	<tr><th>주소</th><td>${customer.address}</td></tr>
	<tr><th>이메일</th><td>${customer.email}</td></tr>
	<tr><td colspan="2">
		<a class="btn btn-info" href="${path }/customer">목록</a>
		<a class="btn btn-danger" onclick="del()">삭제</a></td></tr>
</table>
</div>
</body>
</html>