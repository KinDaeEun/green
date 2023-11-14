<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html><html><head><meta charset="UTF-8">
<title>Insert title here</title></head><body>
<jsp:useBean id="date" class="java.util.Date"></jsp:useBean>
<!-- ko 한국어, kr 한국, en 영어, us 미국, ja 일본어, jp 일본
	 인터넷으로 국가 코드/언어코드 조회하면 알 수 있음 -->
<fmt:setLocale value="ko_kr"/>
<h2>우리나라</h2>
금액 : <fmt:formatNumber value="1000000" type="currency"/><br>
날자 : <fmt:formatDate value="${date}" type="both" 
	dateStyle="full" timeStyle="full"/><br>
	
<fmt:setLocale value="en_us"/>
<h2>미국</h2>
금액 : <fmt:formatNumber value="1000000" type="currency"/><br>
날자 : <fmt:formatDate value="${date}" type="both" 
	dateStyle="full" timeStyle="full"/><br>
	
<fmt:setLocale value="ja_jp"/>
<h2>일본</h2>
금액 : <fmt:formatNumber value="1000000" type="currency"/><br>
날자 : <fmt:formatDate value="${date}" type="both" 
	dateStyle="full" timeStyle="full"/><br>	
</body>
</html>