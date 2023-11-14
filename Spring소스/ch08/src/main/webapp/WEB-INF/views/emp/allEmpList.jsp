<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="../header.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
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
				<th>관리자</th>
				<th>급여</th>
				<th>부서명</th>
				<th>근무지</th>
			</tr>
			<c:if test="${empty list}">
				<tr>
					<td colspan="4">데이터가 없습니다</td>
				</tr>
			</c:if>
			<c:if test="${not empty list}">
				<c:forEach var="emp" items="${list}">
					<tr>
						<td>${emp.empno}</td>
						<td>${emp.ename}</td>
						<td>${emp.job}</td>
						<td>${emp.hiredate}</td>
						<td>${emp.mgrName}(${emp.mgr })</td>
						<td>${emp.sal }</td>
					<%-- 	<td>${emp.dname }</td>
						<td>${emp.loc}</td> --%>
						<td>${emp.dept.dname }</td>
						<td>${emp.dept.loc}</td>
					</tr>
				</c:forEach>
			</c:if>
		</table>
		<a href="${path}/dept/deptList.do" class="btn btn-info">부서목록</a>
	</div>
</body>
</html>