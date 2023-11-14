<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="../header.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript">
	function dupCheck() {
		if (!frm.empno.value) {
			alert("뗏기놈 !! 사번을 입력하고 체크해야지");
			frm.empno.focus();
			return false;
		}
		$.post('empDupChk.do', "empno=" + frm.empno.value, function(data) {
			$('#dup').html(data);
		})
	}
</script>
</head>
<body>
	<div class="container text-center">
		<h2 class="text-primary">직원정보 입력</h2>
		<form action="${path}/emp/empInsert.do" name="frm" method="post">
			<table class="table table-bordered">
				<tr>
					<th>사번</th>
					<td><div class="row">
							<div class="col-auto">
								<input type="number" name="empno" class="form-control"
									required="required" autofocus="autofocus">
							</div>
							<div class="col-auto">
								<input type="button" onclick="dupCheck()" value="중복체크"
									class="btn btn-info btn-sm"> <span id="dup" class="err"></span>
							</div>
						</div></td>
				</tr>
				<tr>
					<th>이름</th>
					<td><input type="text" name="ename" required="required"
						class="form-control"></td>
				</tr>
				<tr>
					<th>업무</th>
					<td><input type="text" name="job" required="required"
						class="form-control"></td>
				</tr>
				<tr>
					<th>관리자</th>
					<td><select name="mgr" class="form-select">
							<c:forEach var="emp" items="${empList}">
								<option value="${emp.empno }">${emp.ename}(${emp.empno})</option>
							</c:forEach>
					</select></td>
				</tr>
				<tr>
					<th>입사일</th>
					<td><input type="date" name="hiredate" required="required"
						class="form-control"></td>
				</tr>
				<tr>
					<th>급여</th>
					<td><input type="number" name="sal" required="required"
						class="form-control"></td>
				</tr>
				<tr>
					<th>커미션</th>
					<td><input type="number" name="comm" required="required"
						class="form-control"></td>
				</tr>
				<tr>
					<th>부서코드</th>
					<td><select name="deptno" class="form-select">
							<c:forEach var="dept" items="${deptList}">
								<c:if test="${dept.deptno== deptno}">
									<option value="${dept.deptno}" selected="selected">${dept.dname}(${dept.deptno})</option>
								</c:if>
								<c:if test="${dept.deptno!= deptno}">
									<option value="${dept.deptno}">${dept.dname}(${dept.deptno})</option>
								</c:if>
							</c:forEach>
					</select></td>
				</tr>
				<tr>
					<td colspan="2" class="text-center bg-success-subtle"><input
						type="submit" value="확인" class="btn btn-warning"></td>
				</tr>
			</table>
		</form>
		<a class="btn btn-success"
			href="${path}/emp/empList.do?deptno=${dept.deptno}">직원목록</a> <a
			class="btn btn-info" href="${path}/dept/deptList.do">부서목록</a>
	</div>
</body>
</html>