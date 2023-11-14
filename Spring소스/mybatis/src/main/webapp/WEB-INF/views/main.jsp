<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="header.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript">
	function del() {
		let cf = confirm("정말로 삭제 하시겠습니까?");
		if (cf)
			location.href = "delete.do";
		else
			alert("탈퇴가 취소 되었습니다");
	}
</script>
</head>
<body>
	<div class="container text-center">
		<h2>${member.name }</h2>
		<table>

			<tr>
				<td><a href="view.do?" class="btn btn-suuccess">조회</a></td>
			</tr>

			<tr>
				<td><a href="view2.do" class="btn btn-suuccess">조회(사진 여러장)</a></td>
			</tr>

			<tr>
				<td><a href="updateForm.do" class="btn btn-suuccess">수정</a></td>
			</tr>

			<tr>
				<td><a onclick="del()" class="btn btn-suuccess">탈퇴</a></td>
			</tr>
			<tr>
				<td><a href="logout.do" class="btn btn-suuccess">로그아웃</a></td>
			</tr>		

		</table>

	</div>
</body>
</html>