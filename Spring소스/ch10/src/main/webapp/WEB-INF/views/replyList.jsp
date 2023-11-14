<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="header.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript">
	function rDelete(bno, rno) {
		let sendData = 'bno='+bno+'&rno='+rno;
		$.post('${path}/rDelete', sendData, function(data){
			alert("댓글이 삭제되었습니다");
			$('#rbdListDisp').html(data);
		});
	}
	function rUpdate(bno, rno) {
// 		td, span, div등의 데이터를 읽을 때는 text()
// 		input, textarea, select의 데이터를 읽을 때는  val() 
// 		td에 있는 text를 읽어서 textarea에 넣어야 수정 가능
		let txt = $('#td_'+rno).text();
// 		읽은 데이터를 textarea에 넣자
        $('#td_'+rno).html(
        	"<textarea row='3' class='form-control' id='rt'>"
        	+txt+"</textarea>");
//      버튼을 확인과 취소로 변경
		$('#btn_'+rno).html("<input type='button' onclick='up("+
			bno+","+rno+")' class='btn btn-danger btn-sm' value='확인'>"+
			"<input type='button' onclick='lst("+bno+")' class='btn btn-sm btn-info'"+
			" value='취소'>");
	}
	function lst(bno) {
		$('#rbdListDisp').load('${path}/replyList/bno/'+bno);
	}
	function up(bno, rno) {
		let sendData = 'replytext='+ $('#rt').val()+'&bno='+bno+
			'&rno='+rno;
		$.post('${path}/rUpdate',sendData, function(data){
			alert("수정되었습니다");
			$('#rbdListDisp').html(data);
		});
	}
</script>
</head>
<body>
	<c:if test="${not empty rbdList }">
		<h3 class="text-primary text-center">댓글</h3>
		<table class="table table-striped">
			<tr class="table-success">
				<td>작성자</td>
				<td>내용</td>
				<td>수정일</td>
				<td></td>
			</tr>
			<c:forEach var="rbd" items="${rbdList }">
				<c:if test="${rbd.del=='y' }">
					<tr class="table-warning">
						<td colspan="4">삭제된 댓글입니다</td>
					</tr>
				</c:if>
				<c:if test="${rbd.del != 'y' }">
						<!--회원게시판에서 로그인 사람 이름/별명/아이디를 자동으로 입력하므로 불필요 -->
					<tr>
						<td>${rbd.replier }<!-- 작성자 --></td>
						<td id='td_${rbd.rno}'><pre>${rbd.replytext }</pre></td>
						<td>${rbd.updatedate }</td>
						<!--회원게시판에서는 로그인 한 사람과 댓글 작성자가 같은지 비교 -->
						<c:if test="${rbd.replier == board.writer }">
							<td id='btn_${rbd.rno}'>
								<input type="button" class="btn btn-warning btn-sm"
								value="수정" onclick="rUpdate(${rbd.bno},${rbd.rno})"> <input type="button"
								class="btn btn-danger btn-sm" value="삭제" onclick="rDelete(${rbd.bno},${rbd.rno})"></td>
						</c:if>
						<c:if test="${rbd.replier != board.writer }">
							<td></td>
						</c:if>
					</tr>
				</c:if>
			</c:forEach>
		</table>
	</c:if>
</body>
</html>