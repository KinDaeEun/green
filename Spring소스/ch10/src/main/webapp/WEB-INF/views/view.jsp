<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="header.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript">
	$(function() {
		$('#rbdListDisp').load('${path}/replyList/bno/${board.num}');
		$('#boardDisp').load('${path}/list/pageNum/${pageNum}');
		$('#rInsert').click(function(){
			/* let sendData = "bno="+frm1.bno.value+
			 "&replier=" +frm1.replier.value+
			  &                                     */
			let sendData = $('#frm1').serialize();
			$.post('${path}/rInsert',sendData, function(data){
					alert("댓글이 입력되었습니다");
			        $('#rbdListDisp').html(data); 
			});					
		});
	});
</script>
</head>
<body>
	<div class="container text-center">
		<h2 class="text-primary">게시글 상세 내역</h2>
		<table class="table table-hover">
			<tr class="table-danger">
				<td>제목</td>
				<td>${board.subject}</td>
			</tr>
			<tr class="table-info">
				<td>작성자</td>
				<td>${board.writer}</td>
			</tr>
			<tr class="table-default">
				<td>조회수</td>
				<td>${board.readcount}</td>
			</tr>
			<tr class="table-success">
				<td>작성일</td>
				<td>${board.reg_date}</td>
			</tr>
			<tr class="table-warning">
				<td>내용</td>
				<td><pre>${board.content}</pre></
				td>
			</tr>
			<tr>
				<td colspan="2"><a class="btn btn-info"
					href="${path }/list/pageNum/${pageNum}">게시글 목록</a> <a
					class="btn btn-warning"
					href="${path }/updateForm/num/${board.num}/pageNum/${pageNum}">수정</a>
					<a class="btn btn-danger"
					href="${path }/deleteForm/num/${board.num}/pageNum/${pageNum}">삭제</a>
					<!-- 답변글은 num에 현재 조회한  num번호 --> <a class="btn btn-success"
					href="${path }/insertForm/num/${board.num}/pageNum/${pageNum}">답글</a>
				</td>
			</tr>
		</table>
		<h2 class="text-primary">댓글 작성</h2>
		<!-- submit할때 action없음 자신(view)를 한번 수행, 
여기서는 ajax처리할 예정이므로 submit하지 않음 -->

		<form action="" name="frm1" id="frm1">
			<input type="hidden" name="bno" value="${board.num}">
			<table>
				<!-- 회원게시판에서는 writer가 아니라 로그인한 사람의 이름/별명/id -->
				<tr>
					<th>작성자</th>
					<td><input type="text" name="replier" value="${board.writer }"
						class="form-control"></td>
					<th>댓글</th>
					<td><textarea rows="1" cols="50" class="form-control" name="replytext"></textarea></td>
					<td><input type="button" value="댓글입력" id="rInsert"
						class="btn btn-success btn-sm"></td>
				</tr>
			</table>
		</form>
		<div id="rbdListDisp"></div>
		<div id="boardDisp"></div>
	</div>
</body>
</html>