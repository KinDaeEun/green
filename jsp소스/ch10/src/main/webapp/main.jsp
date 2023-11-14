<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="sessionChk.jsp"%>
<!-- 이 파일 안에 있는 변수 사용가능 -->
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="common.css">
<script type="text/javascript">
	function del() {
		let ch = confirm("정말로 탈퇴하시겠습니까?")
		if(ch) 
			location.href="delete.jsp";
		else
			alert("삭제가 취소 되었습니다")
			
	}
	function chk() {
		//목록은 관리자만 볼 수 있다
		//javascript에서 자바변수를 사용할 때는 큰 따움포로 묶어야한다
		let id = "<%=id%>";
		if(id != 'master'){
			alert('회원목록을 볼 권한이 없습니다');
			return;
		}else
			location.href="list.jsp";
	}
</script>
</head>
<body>
	<table>
		<caption>회원관리</caption>
		<tr>
			<th><button onclick="location.href='updateForm.jsp'">회원정보 수정</button></th>
		</tr>
		<tr>
			<th><button onclick="del()">회원탈퇴</button></th>
		</tr>
		<tr>
			<th><button onclick="chk()">회원목록</button></th>
		</tr>
		<tr>
			<th><button onclick="location.href='logout.jsp'">로그아웃</button></th>
		</tr>
	</table>
</body>
</html>