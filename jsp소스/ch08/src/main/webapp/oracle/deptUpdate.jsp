<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.sql.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
	
	request.setCharacterEncoding("utf-8");
	int deptno = Integer.parseInt(request.getParameter("deptno"));
	String dname = request.getParameter("dname");
	String loc = request.getParameter("loc");
	String driver = "oracle.jdbc.OracleDriver";
	String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
	String sql = "update dept set dname=?,loc=? where deptno=?";
	Connection conn = null;
	PreparedStatement pstmt = null;
	try{
		Class.forName(driver);
		conn=DriverManager.getConnection(url,"scott","tiger");
		pstmt = conn.prepareStatement(sql);
		pstmt.setString(1,dname);
		pstmt.setString(2,loc);
		pstmt.setInt(3,deptno);
		int result = pstmt.executeUpdate();
		if(result>0){
%>		
		<script type="text/javascript">
			alert("수정 되었습니다");
			location.href="select.jsp";
		</script>
<%	}else
		out.println("수정 실패");
}catch(Exception e){ 
	System.out.println(e.getMessage());
%>
	
	<script type="text/javascript">
		alert("똑바로 해, 실패");
		history.back();
	</script>
<%}finally{
		pstmt.close();conn.close();
   }
%>
</body>
</html>