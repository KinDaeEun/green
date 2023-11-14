<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="header.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<div class="container text-center">
		<h2 class="text-primary">게시글 수정</h2>
		<form action="${path }/update" method="post" name="frm">
			<input type="hidden" name="num" value="${board.num}">
			<input type="hidden" name="pageNum" value="${pageNum}">
			<table class="table table-striped">
				<tr class="table-success">
					<th>제목</th>
					<td><input type="text" name="subject" required="required"
						autofocus="autofocus" class="form-control" value="${board.subject}"></td>
				</tr>
				<!-- 회원 게시판에는 사용 안함 시작 -->
				<tr class="table-info">
					<th>작성자</th>
					<td><input type="text" name="writer" required="required"
						class="form-control" value="${board.writer}"></td>
				</tr>
				<tr class="table-danger">
					<th>암호</th>
					<td><input type="password" name="password" required="required"
						class="form-control"></td>
				</tr>
				<!-- 회원 게시판에는 사용 안함 종료 -->
				<tr class="table-active">
					<th>내용</th>
					<td><textarea rows="5" cols="40" class="form-control"
							name="content" required="required">${board.content}</textarea></td>
				</tr>
				<tr>
					<td colspan="2" class="table-warning text-center"><input
						type="submit" value="수정 완료" class="btn btn-primary"></td>
				</tr>
			</table>
		</form>
	</div>
</body>
</html>