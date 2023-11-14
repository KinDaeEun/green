 <%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="common.css">
<script type="text/javascript" src="js/jquery.js"></script>
<script type="text/javascript">
	function dupChk() {
		if(!frm.id.value){
			alert("아이디를 입력하고 체크하시오");
			frm.id.focus();
			return false;
		}
		/* $가 jQuery post방식 */
		$.post("confirm2.jsp","id="+frm.id.value,
		//data는 confirm2.jsp를 수행하고 전달 받은 값
				function(data){
					//id가 err인 곳에 html로 보야줘라
					$('#err').html(data);
		});
		frm.dup.value="1";
		// window.open("firm1.jsp?id="+frm.id.value,"","width=300 height=300"); 
	}
	function chk() {
		if(frm.password.value != frm.password2.value){
			alert("암호와 암호확인이 다릅니다");
			frm.password.focus();
			frm.password.value ="";
			frm.password2.value ="";
			return false;
		}
		if(frm.dup.value != 1){
			alert("중복확인 하세요");
			frm.id.focus();
			return false;
		}
	}
</script>
</head>
<body>
	<form action="join.jsp" method="post" name="frm" onsubmit="return chk()">
		<input type="hidden" name="dup" value="0">
		<table>
		<caption>회원 가입</caption>
			<tr>
				<th>아이디</th>
				<td><input type="text" name="id" required="required"
					autofocus="autofocus"> <input type="button" value="중복체크"
					onclick="dupChk()" required="required">
					<div id="err"></div></td>
			</tr>
			<tr>
				<th>암호</th>
				<td><input type="password" name="password" required="required"></td>
			</tr>
			<tr>
				<th>암호확인</th>
				<td><input type="password" name="password2" required="required"></td>
			</tr>
			<tr>
				<th>이름</th>
				<td><input type="text" name="name" required="required"></td>
			</tr>
			<tr>
				<th>주소</th>
				<td><input type="text" name="address" required="required"></td>
			</tr>
			<tr>
				<th>전화</th>
				<td><input type="tel" name="tel" required="required" placeholder="010-1111-1111"
					pattern="010-\d{3,4}-\d{4}" title="전화형식 010-1111-1111"></td>
			</tr>
			<tr>
				<th colspan="2"><input type="submit" value="확인"></th>

			</tr>
			
		</table>

	</form>
	<button onclick="location.href='loginForm.jsp'">로그인</button>
</body>
</html>