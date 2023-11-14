<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="ch11.*"%>
<!DOCTYPE html><html><head><meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="common.css"></head><body>
<%	String pageNum = request.getParameter("pageNum");
	int num=Integer.parseInt(request.getParameter("num"));
	String password = request.getParameter("password");
	BoardDao bd = BoardDao.getInstance();
	int result = bd.delete(num, password);	 
	if (result > 0) {
%>
<script type="text/javascript">
	alert("게시글이 삭제 되었습니다");
	location.href="list.jsp?pageNum=<%=pageNum%>";
</script>
<%   } else if (result == 0) { %>
<script type="text/javascript">
	alert("에효 !! 삭제가 안되네 ㅠㅠ");
	history.go(-1);
</script>
<%   } else { %>
<script type="text/javascript">
	alert("암호가 다릅니다");
	history.go(-1);
</script>
<%   } %>
</body>
</html>