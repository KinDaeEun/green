

 <%@page import="ch11.*"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
@import url("common.css");
</style> 

</head>
<body>

	<%
	final int ROW_PER_PAGE = 10;//한페이지의 댓글 갯수
	final int PAGE_PER_BLOCK = 10;//한 블록의 페이지 갯수
	String pageNum = request.getParameter("pageNum");
	if (pageNum == null || pageNum.equals(""))
		pageNum = "1";
	int currentPage = Integer.parseInt(pageNum);//페이지 번호

	//	시작번호	(페이지번호 - 1) * 페이지당 갯수+ 1				
	int startRow = (currentPage - 1) * ROW_PER_PAGE + 1;//해당 페이지의 첫 댓글
	//  끝번호 	시작번호 + 페이지당개수 - 1			
	int endRow = startRow + ROW_PER_PAGE - 1;

	BoardDao bd = BoardDao.getInstance();
	int total = bd.getTotal(); //총 댓글 수
	int num = total - startRow + 1;
	int totalPage = (int) Math.ceil((double) total / ROW_PER_PAGE); //총 페이지 수
	//	현재페이지 - (현재페이지 - 1)%10
	int startPage = currentPage - (currentPage - 1) % PAGE_PER_BLOCK;//한 블록의 사작 페이지
	//	시작페이지 + 블록당페이지 수 -1
	int endPage = startPage + PAGE_PER_BLOCK - 1;
	//  endPage는 총페이지 보다 크면 안된다	
	if (endPage > totalPage)
		endPage = totalPage;
	List<Board> list = bd.list(startRow, endRow);
	pageContext.setAttribute("list", list);
	%>
	<table>
		<caption>게시글 목록</caption>
		<tr>
			<th>번호</th>
			<th>제목</th>
			<th>작성자</th>
			<th>작성일</th>
			<th>조회수</th>
		</tr>
		<c:if test="${ empty list }">
			<tr>
				<th colspan="5">게시글이 없습니다</th>
			</tr>
		</c:if>
		
		<c:if test="${not empty list }">
			<c:forEach var="board" items="${list }">
				<tr>
					<td>${board.num }</td>
					<c:if test="${board.del == 'y' }">
						<th colspan="4">삭제된 글입니다</th>
					</c:if>

					<c:if test="${board.del != 'y' }">
						<td title="${board.content }">
							<c:if test="${board.re_level > 0 }">
								<img alt="" src="images/level.gif" height="5" width="${board.re_level*10}">
								<img alt="" src="images/re.gif">
							</c:if>		
							<a href="content.jsp?num=${board.num}&pageNum=<%=currentPage%>">${board.subject }</a>						
							<c:if test="${board.readcount > 50 }">
								<img alt="" src="images/hot.gif">
							</c:if>
						</td>
						<td>${board.writer }</td>
						<td>${board.reg_date }</td>
						<td>${board.readcount }</td>
					</c:if>
				</tr>
			</c:forEach>
		</c:if>
	</table>
	<div align="center">
		<!-- 앞에 보여줄께 있어 -->
		<%
		if (startPage > PAGE_PER_BLOCK) {
		%>
		<button onclick="location.href='list.jsp?pageNum=<%=startPage - 1%>'">이전</button>
		<%
		}
		%>
		<c:forEach var="i" begin="<%=startPage%>" end="<%=endPage%>">
			<button onclick="location.href='list.jsp?pageNum=${i}'">${i}</button>
		</c:forEach>
		<!-- 아직 보여줄께 남아있다 -->
		<%
		if (endPage < totalPage) {
		%>
		<button onclick="location.href='list.jsp?pageNum=<%=endPage + 1%>'">다음</button>
		<%
		}
		%>
	</div>
	<br>
	<div align="center">
		<button onclick="location.href='writeForm.jsp?num=0&pageNum=1'">글쓰기</button>
	</div>
</body>
</html> 