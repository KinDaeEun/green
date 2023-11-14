<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="../../header.jsp" %>
<!DOCTYPE html><html><head><meta charset="UTF-8">
<title>Insert title here</title></head><body>
<div class="container text-center">
<form:form modelAttribute="editCustomer">
<table class="table table-bordered table-hover">
<%--<input type="text" name="name" value="${editCustomer.name }"> --%>
	<tr><th><span class="form-control bg-success-subtle">이름</span></th><td><form:input path="name" cssClass="form-control"/>
	<!-- validor로 검사하여 에러가 발생하면 출력 cssClass=class -->
		<form:errors path="name" cssClass="err"></form:errors>
	</td></tr>
	<tr><th><span class="form-control bg-info">주소</span></th><td><form:input path="address" cssClass="form-control"/>
		<form:errors path="address" cssClass="err"></form:errors></td></tr>
	<tr><th><span class="form-control bg-danger-subtle">이메일</span></th><td><form:input path="email" cssClass="form-control"/>
		<form:errors path="email" cssClass="err"></form:errors></td></tr>
	<tr><td colspan="2" align="center">
		<button type="submit" value="process" class="btn btn-success"
		name="event_process">다음</button></td></tr>
</table>
</form:form>
</div>
</body>
</html>