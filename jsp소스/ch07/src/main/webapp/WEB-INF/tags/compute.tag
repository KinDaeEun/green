<%@ tag language="java" pageEncoding="UTF-8"%>
<%@ tag body-content="scriptless"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ attribute name="var" required="true" rtexprvalue="false"%>
<%@ attribute name="start" required="true" type="java.lang.Integer"%>
<%@ attribute name="end" required="true" type="java.lang.Integer"%>
<!-- scopr="NESTED"는 return을 중간에서 전잘 -->
<%@ variable name-from-attribute="var" alias="number"
 variable-class="java.lang.Integer" scope="NESTED" %>
<%
	for(int i =start;i<=end;i++){%>
		<c:set var="number" value="<%=i %>"></c:set>	<p>
		<jsp:doBody></jsp:doBody>
	<%}
%>
