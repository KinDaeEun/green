
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html><html><head><meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="common.css">
<script type="text/javascript" src="js/jquery.js"></script>

<script type="text/javascript">
	$(function() {  // 화면이 뜨면 작동해
		// id가 disp인 곳에 list.jsp를 실행해서 보여줘
		$('#disp').load("list.do?pageNum=${pageNum}");
	});
</script></head><body>

<table><caption>테이블 상세보기</caption>
	<tr><th>제목</th><td>${board.subject }</td></tr>
	<tr><th>작성자</th><td>${board.writer }</td></tr>
	<tr><th>조회수</th><td>${board.readcount }</td></tr>
	<tr><th>작성일</th><td>${board.reg_date }</td></tr>
	<tr><th>내용</th><td><pre>${board.content }</pre></td></tr>
	<tr><th colspan="2">
		<button onclick="location.href='updateForm.do?num=${board.num}&pageNum=${pageNum}'">수정</button>
		<button onclick="location.href='deleteForm.do?num=${board.num}&pageNum=${pageNum}'">삭제</button>
		<button onclick="location.href='writeForm.do?num=${board.num}&pageNum=${pageNum}'">답변</button>
		<button onclick="location.href='list.do?pageNum=${pageNum}'">목록</button>
</table>
<div id="disp"></div>
</body>
</html>