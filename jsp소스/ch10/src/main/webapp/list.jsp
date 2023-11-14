<%@page import="ch10.*"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="sessionChk.jsp"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="common.css">
</head>
<body>
	<%
	MemberDao md = MemberDao.getInstance();
	final int ROW_PER_PAGE = 10;
	final int PAGE_PER_BLOCK = 10;
	String pageNum = request.getParameter("pageNum");
	if(pageNum == null || pageNum.equals("")){
		pageNum = "1";
	}
	int currentNum = Integer.parseInt(pageNum);

	int startRow = (currentNum -1) * ROW_PER_PAGE+1;
	int endRow = startRow + ROW_PER_PAGE;
	int total = md.getTotal();
	int totalPage =(int) Math.ceil((double)total/PAGE_PER_BLOCK);
	int startPage = currentNum - (currentNum-1)%PAGE_PER_BLOCK;
	int endPage = startPage+PAGE_PER_BLOCK-1;
	if(endPage>totalPage)
		endPage=totalPage;
	List<Member> list = md.list(startRow, endRow); 
	pageContext.setAttribute("list", list);
	
	%>
	<table>
		<caption>회원 목록</caption>
		<tr>
			<th>아이디</th>
			<th>이름</th>
			<th>주소</th>
			<th>전화번호</th>
			<th>가입일</th>
			<th>탈퇴여부</th>
		</tr>
		<c:if test="${empty list }">
			<tr><th colspan="6">데이터가 없습니다</th></tr>
		</c:if>	
		<c:if test="${not empty list }">
			<c:forEach var="member" items="${list }">
				<tr>
					<td>${member.id }</td>
					<td>${member.name }</td>
					<td>${member.address }</td>
					<td>${member.tel }</td>
					<td>${member.reg_date }</td>
					<td>${member.del }</td>
				</tr>
			</c:forEach>
		</c:if>
	</table>
	<div align="center">
		<%if(startPage>PAGE_PER_BLOCK){ %>
			<button onclick="location.href='list.jsp?pageNum=<%=startPage-1%>'">이전</button> 
		<%} %>
		<c:forEach var="i" begin="<%=startPage %>" end="<%=endPage%>">
			<button onclick="location.href='list.jsp?pageNum=${i}'">${i }</button>
		</c:forEach>
		<%if(endPage<totalPage){ %>
			<button onclick="location.href='list.jsp?pageNum=<%=endPage+1%>'">다음</button> 
		<%} %>
	</div>
	
</body>
</html>

