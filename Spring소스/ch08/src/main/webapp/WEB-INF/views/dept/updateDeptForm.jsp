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
		<h2 class="text-primary">부서정보 입력</h2>
		<form action="${path}/dept/updateDept.do" name="frm" method="post">
			<table class="table table-hover">
				<tr>
					<th><span class="form-control">부서코드</span></th>
					<td class="row"><div class="col-auto">
							<input type="number" name="deptno" readonly="readonly"
								autofocus="autofocus" min="10" max="99" class="form-control" value="${dept.deptno }">
						</div></td>
				</tr>
				<tr>
					<th><span class="form-control">부서명</span></th>
					<td><input type="text" name="dname" required="required"
						class="form-control" value="${dept.dname }"></td>
				</tr>
				<tr>
					<th><span class="form-control">근무지</span></th>
					<td><input type="text" name="loc" required="required"
						class="form-control" value="${dept.loc }"></td>
				</tr>
				<tr>
					<td colspan="2" align="center"><input type="submit" value="확인"
						class="btn btn-info"></td>
				</tr>
			</table>
		</form>
		<a href="${path }/dept/deptList.do" class="btn btn-primary">부서 목록</a>
	</div>
</body>
</html>