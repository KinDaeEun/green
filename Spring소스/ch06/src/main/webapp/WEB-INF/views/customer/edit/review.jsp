<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="../../header.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<div class="container text-center">
		<h2 class="text-success">수정결과 확인</h2>
		<form action="review">
			<table class="table table-bordered table-hover">
				<tr>
					<th width="30%">이름 <i class="bi bi-person-circle icofont-2x"></i>
					</th>
					<td class="bg-info">${editCustomer.name }</td>
				</tr>
				<tr>
					<th>주소 <i class="icofont-duotone icofont-address icofont-2x"></i></th>
					<td class="bg-success">${editCustomer.address }</td>
				</tr>
				<tr>
					<th>이메일 <i
						class="icofont-duotone icofont-mass-mail icofont-2x"></i></th>
					<td class="bg-warning">${editCustomer.email}</td>
				</tr>
				<tr>
					<td colspan="2" align="center">
						<button type="submit" name="event_confirm" class="btn btn-success">확인</button>
						<button type="submit" name="event_cancel" class="btn btn-warning">취소</button>
			</table>
		</form>
	</div>
</body>
</html>