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
	<div class="container">
		<h2 class="text-primary">부서 상세정보</h2>
		<table class="table table-bordered">
			<tr>
				<th>부서코드</th>
				<td>${dept.deptno }</td>
			</tr>
			<tr>
				<th>부서명</th>
				<td>${dept.dname }</td>
			</tr>
			<tr>
				<th>근무지</th>
				<td>${dept.loc}</td>
			</tr>
		</table>
		<a href="deptList.do" class="btn btn-info">부서목록</a>
		<div id="disp"></div>
	</div>
	<script type="text/javascript">
		$('#disp').load('deptList.do table');
	</script>
</body>
</html>