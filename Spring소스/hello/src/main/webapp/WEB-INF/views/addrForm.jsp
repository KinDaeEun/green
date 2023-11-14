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
	<div class="container" align="center">
		<h2 class="text-primary">이름과 주소</h2>
		<!-- <form action="addr"> -->
		<!-- <form action="addr2"> -->
		<form action="addr3">
			<table class="table table-bordered">
				<tr>
					<th class="form-control">이름 <i
						class="icofont-duotone icofont-add-users"></i>
					</th>
					<td><input type="text" name="name" required="required"
						autofocus="autofocus" class="form-control"></td>
				</tr>
				<tr>
					<th class="form-control">주소 <i
						class="icofont-duotone icofont-address"></i></th>
					<td><input type="text" name="addr" required="required"
						class="form-control"></td>
				</tr>
				<tr>
					<td colspan="2" align="center"><input type="submit"
						class="btn btn-info form-control"></td>
				</tr>
			</table>
		</form>
	</div>
</body>
</html>