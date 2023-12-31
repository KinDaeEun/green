<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="../header.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript">
	$(function() {
		$('#deptList').load('${path}/dept/deptList.do table');
	});
</script>
</head>
<body>
	<div class="container text-center">
		<h2 class="text-primary">${dept.dname }직원 목록</h2>
		<table class="table table-striped">
			<tr>
				<th>사번</th>
				<th>이름</th>
				<th>업무</th>
				<th>입사일</th>
			</tr>
			<c:if test="${empty empList}">
				<tr>
					<td colspan="4">데이터가 없습니다</td>
				</tr>
			</c:if>
			<c:if test="${not empty empList}">
				<c:forEach var="emp" items="${empList}">
					<tr>
						<td>${emp.empno}</td>
						<td><a href="${path}/emp/empSelect.do?empno=${emp.empno}">${emp.ename}</a></td>
						<td>${emp.job}</td>
						<td>${emp.hiredate}</td>
					</tr>
				</c:forEach>
			</c:if>
		</table>
		<a href="${path}/dept/deptList.do" class="btn btn-info">부서목록</a> <a
			href="${path}/emp/empInsertForm.do?deptno=${dept.deptno}"
			class="btn btn-warning">직원정보 입력</a>
		<div id="deptList"></div>
	</div>
</body>
</html>