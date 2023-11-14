<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="../header.jsp" %>
<!DOCTYPE html><html><head><meta charset="UTF-8">
<title>Insert title here</title></head><body>
<c:if test="${result > 0}">
	<script type="text/javascript">
		alert("입력 성공 ㅋㅋ");
		location.href="${path}/emp/empList.do?deptno=${deptno}";
	</script>
</c:if>
<c:if test="${result == 0}">
	<script type="text/javascript">
		alert("입력 실패 에구구");
		history.back();
	</script>
</c:if>
<c:if test="${result == -1}">
	<script type="text/javascript">
		alert("중복됐다구 했잖아 !! 의이그");
		history.back();
	</script>
</c:if>
</body>
</html>