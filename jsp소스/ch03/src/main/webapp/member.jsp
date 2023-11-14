<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
@import url("common.css");
</style>
<script>
	function chk(){
		if(frm.pass.value != frm.pass2.value){
			alert("암호와 암호 확인 다름니다");
			frm.pass.focus();
			frm.pass.value = "";
			frm.pass2.value = ""; 
			return false;	
		}
		if(frm.hobby[frm.hobby.selectedIndex].value =="기타"){
			if(!frm.hobby2.value){
				alert("취미를 입력하세요");
				frm.hobby2.focus();
				return false;
			}else{
				frm.hobby[frm.hobby.selectedIndex].value = frm.hobby2.value;
			}
		}
	}

</script>
</head>
<body>
	<form action="member_result.jsp" method = "post" name="frm" onsubmit="return chk()">
		<table>
			<caption>회원가입</caption>
			<tr>
				<th>이름</th>
				<td><input type="text" name = "name" required autofocus></td>
			</tr>
			<tr>
				<th>아이디</th>
				<td><input type="text" name = "id" required></td>
			</tr>
			<tr>
				<th>암호</th>
				<td><input type="password" name = "pass" required ></td>
			</tr>
			<tr>
				<th>암호확인</th>
				<td><input type="password" name = "pass2" required ></td>
			</tr>
			<tr>
				<th>성별</th>
				<td><label for="male">남자:</label>
				    <input type="radio" name = "gender" value="남자" id="male" checked>
				    <label for="female">여자:</label>
				    <input type="radio" name = "gender" value="여자" id="female">
				</td>
			</tr>
			<tr>
				<th>취미</th>
				<td>
					<select name="hobby">
						<option>졸기</option>
						<option>울기</option>
						<option>자기</option>
						<option>기타</option>
					</select>
					<input type="text" name="hobby2">
				</td>
			</tr>
			<tr><th colspan="2"><input type="submit"></th></tr>
		</table>
	</form>
</body>
</html>