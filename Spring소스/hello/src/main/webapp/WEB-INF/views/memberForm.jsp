<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="member">
		<table class="table table-bordered">
			<tr>
				<th class="form-control">이름</th>
				<td><input type="text" name="name" required="required"
					autofocus="autofocus" class="form-control"></td>
			</tr>
			<tr>
				<th class="form-control">주소 </th>
				<td><input type="text" name="addr" required="required"
					class="form-control"></td>
			</tr>
			<tr>
				<th class="form-control">나이 </th>
				<td><input type="number" name="age" required="required"
					class="form-control"></td>
			</tr>
			<tr>
				<th class="form-control">성별 </th>
				<td><select name="gender">
					<option>남자</option>
					<option>여자</option>
				</select></td>
			</tr>
			<tr>
				<th class="form-control">취미 </th>
				<td><input type="text" name="hobby" required="required"
					class="form-control"></td>
			</tr>
			<tr>
				<td colspan="2" align="center"><input type="submit"
					class="btn btn-info form-control"></td>
			</tr>
		</table>
	</form>
</body>
</html>