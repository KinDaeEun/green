<%@page import="ch11.*"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html><html><head><meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="common.css">
<script type="text/javascript" src="js/jquery.js"></script>
<%  String pageNum = request.getParameter("pageNum"); %>
<script type="text/javascript">
	$(function() {  // 화면이 뜨면 작동해
		// id가 disp인 곳에 list.jsp를 실행해서 보여줘
		$('#disp').load("list.jsp?pageNum=<%=pageNum%>");
	});
</script></head><body>
<%	
	int num = Integer.parseInt(request.getParameter("num"));
	BoardDao bd = BoardDao.getInstance();
	bd.readCountUpdate(num); 
	Board board = bd.select(num); 
	pageContext.setAttribute("board", board);
%>
<table><caption>테이블 상세보기</caption>
	<tr><th>제목</th><td>${board.subject }</td></tr>
	<tr><th>작성자</th><td>${board.writer }</td></tr>
	<tr><th>조회수</th><td>${board.readcount }</td></tr>
	<tr><th>작성일</th><td>${board.reg_date }</td></tr>
	<tr><th>내용</th><td><pre>${board.content }</pre></td></tr>
	<tr><th colspan="2">
		<button onclick="location.href='updateForm.jsp?num=${board.num}&pageNum=<%=pageNum%>'">수정</button>
		<button onclick="location.href='deleteForm.jsp?num=${board.num}&pageNum=<%=pageNum%>'">삭제</button>
		<button onclick="location.href='writeForm.jsp?num=${board.num}&pageNum=<%=pageNum%>'">답변</button>
		<button onclick="location.href='list.jsp?pageNum=<%=pageNum%>'">목록</button>
</table>
<div id="disp"></div>
</body>
</html>