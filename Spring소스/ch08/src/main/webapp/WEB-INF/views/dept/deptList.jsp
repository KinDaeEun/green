<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="../header.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript">
	function del(deptno) {
		let cf = confirm("정말로 삭제하시겠습니까 ?");
		if (cf) 
			location.href="${path}/dept/deleteDept.do?deptno="+deptno;
		else alert("삭제가 취소 되었습니다");
	}
</script>
</head>
<body>
	<div class="container text-center">
		<h2 class="text-primary">부서 목록</h2>
		<table class="table table-striped">
			<tr>
				<th>부서코드</th>
				<th>부서명</th>
				<th>근무지</th>
				<th>수정</th>
				<th>삭제</th>
			</tr>
			<c:forEach var="dept" items="${deptList }">
				<tr align="center">
					<td>${dept.deptno}</td>
					<td><a href="${path}/emp/empList.do?deptno=${dept.deptno}" class="btn btn-primary">${dept.dname}</a></td>
					<td>${dept.loc }</td>
					<td><a class="btn btn-warning btn-sm"
						href="${path}/dept/updateDeptForm.do?deptno=${dept.deptno}">수정</a></td>
					<td><a class="btn btn-danger btn-sm"
						onclick="del(${dept.deptno})">삭제</a></td>
				</tr>

			</c:forEach>
		</table>
		<%-- ${path }는 /ch08과 같다 --%>
		<a class="btn btn-info" href="${path }/dept/insertDeptForm.do">부서정보
			입력</a> <a class="btn btn-primary" href="${path }/emp/allEmpList.do">전직원
			목록</a>
	</div>
</body>
</html>