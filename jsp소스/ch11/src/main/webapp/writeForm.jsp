<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" import="ch11.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="common.css">
<script type="text/javascript">
	function chk() {
		if (frm.password.value != frm.password2.value) {
			alert("암호와 암호확인이 다릅니다");
			frm.password.focus();
			frm.password.value = "";
			frm.password2.value = "";
			return false;
		}
	}
</script>
</head>
<body>
	<%
	String pageNum = request.getParameter("pageNum");
	int num = 0, ref = 0, re_level = 0, re_step = 0;
	num = Integer.parseInt(request.getParameter("num"));
	System.out.println("num = " + num);
	if (num != 0) { // 답변글 num=0이면 처음 쓴글
		BoardDao bd = BoardDao.getInstance();
		Board board = bd.select(num); // 읽은 글에 대한 정보
		ref = board.getRef();
		re_level = board.getRe_level();
		re_step = board.getRe_step();
	}
	%>
	<form action="write.jsp" method="post" name="frm"
		onsubmit="return chk()">
		<input type="hidden" name="pageNum" value="<%=pageNum%>"> <input
			type="hidden" name="num" value="<%=num%>">
		<!-- ref, re_step, re_level은 답변글에서 사용 -->
		<input type="hidden" name="ref" value="<%=ref%>"> <input
			type="hidden" name="re_level" value="<%=re_level%>"> <input
			type="hidden" name="re_step" value="<%=re_step%>">
		<table>
			<caption>게시글 작성</caption>
			<%
			if (num == 0) {
			%>
			<tr>
				<th>제목</th>
				<td><input type="text" name="subject" required="required"
					autofocus="autofocus"></td>
			</tr>
			<%
			} else {
			%>
			<tr>
				<th>제목</th>
				<td><input type="text" name="subject" required="required"
					autofocus="autofocus" value="답변)"></td>
			</tr>
			<%
			}
			%>
			<!-- 회원 게시판에서 필요 없음 시작 -->
			<tr>
				<th>작성자</th>
				<td><input type="text" name="writer" required="required"></td>
			</tr>
			<tr>
				<th>암호</th>
				<td><input type="password" name="password" required="required"></td>
			</tr>
			<tr>
				<th>암호확인</th>
				<td><input type="password" name="password2" required="required"></td>
			</tr>
			<!-- 회원 게시판에서 필요 없음 끝 -->
			<tr>
				<th>내용</th>
				<td><textarea rows="5" cols="40" name="content"
						required="required"></textarea></td>
			</tr>
			<tr>
				<th colspan="2"><input type="submit" value="확인"></th>
			</tr>
		</table>
	</form>
</body>
</html>