<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="header.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript">
	function chk() {
		if (frm.password.value != frm.password2.value) {
			alert("암호가 확인과 다릅니다");
			frm.password.focus();
			frm.password.value = "";
			frm.password2.value = "";
			return false;
		}
	}
</script>
</head>
<body>
	<div class="container text-center">
		<h2 class="text-primary">게시물 작성</h2>
		<form action="${path }/insert" method="post" name="frm"
			onsubmit="return chk()">
			<input type="hidden" name="num" value="${num }"> <input
				type="hidden" name="pageNum" value="${pageNum }"> <input
				type="hidden" name="ref" value="${ref }"> <input
				type="hidden" name="re_level" value="${re_level }"> <input
				type="hidden" name="re_step" value="${re_step }">
			<table class="table table-striped">
				<c:if test="${num == 0 }">
					<tr>
						<th>제목</th>
						<td><input type="text" name="subject" required="required"
							autofocus="autofocus" class="form-control"></td>
					</tr>
				</c:if>
				<c:if test="${num != 0 }">
					<tr>
						<th>제목</th>
						<td><input type="text" name="subject" required="required"
							autofocus="autofocus" class="form-control" value="답변)"></td>
					</tr>
				</c:if>
				<tr>
					<th>작성자</th>
					<td><input type="text" name="writer" required="required"
						class="form-control"></td>
				</tr>
				<tr>
					<th>암호</th>
					<td><input type="password" name="password" required="required"
						class="form-control"></td>
				</tr>
				<tr>
					<th>암호확인</th>
					<td><input type="password" name="password2"
						required="required" class="form-control"></td>
				</tr>
				<tr>
					<th>내용</th>
					<td><textarea rows="5" cols="40" class="form-control"
							name="content" required="required"></textarea></td>
				</tr>
				<tr>
					<td colspan="2" class="table-warning text-center"><input
						type="submit" value="확인" class=" btn btn-success"></td>
				</tr>
			</table>
		</form>
	</div>


</body>
</html>