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
		$('#empList').load('empList.do table', 'deptno=${emp.deptno}');
	});
	function del(empno) {
		let cf = confirm("정말로 삭제 하시겠습니까 ?");
		if (cf) location.href="${path}/emp/empDelete.do?empno="+empno;
		else alert("삭제가 취소 되었습니다");
	}
</script>
</head>
<body>
	<div class="container text-center">
		<h2 class="text-primary">직원정보 상세</h2>
		<table class="table table-bordered">
			<tr>
				<th>사번</th>
				<td>${emp.empno }</td>
				<th>이름</th>
				<td>${emp.ename }</td>
			</tr>
			<tr>
				<th>업무</th>
				<td>${emp.job }</td>
				<th>관리자</th>
				<td>${emp.mgr}(${emp.mgrName })</td>
			</tr>
			<tr>
				<th>입사일</th>
				<td>${emp.hiredate }</td>
				<th>급여</th>
				<td>${emp.sal }</td>
			</tr>
			<tr>
				<th>커미션</th>
				<td>${emp.comm }</td>
				<th>부서코드</th>
				<td>${emp.deptno }</td>
			</tr>
			<tr>
				<td colspan="4" class="text-center bg-info-subtle"><a
					href="${path }/emp/empList.do?deptno=${emp.deptno}"
					class="btn btn-info">직원목록</a> <a
					href="${path }/emp/empUpdateForm.do?empno=${emp.empno}"
					class="btn btn-warning">수정</a> <a class="btn btn-danger"
					onclick="del(${emp.empno})">삭제</a> <a class="btn btn-success"
					href="${path }/dept/deptList.do">부서목록</a></td>
			</tr>
		</table>
		<div id="empList"></div>
	</div>
</body>
</html>