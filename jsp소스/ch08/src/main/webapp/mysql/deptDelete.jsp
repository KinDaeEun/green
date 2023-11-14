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
	String driver = "com.mysql.cj.jdbc.Driver";
	String url="jdbc:mysql://127.0.0.1:3306/test?useSSL=false&serverTimezone=UTC&allowPublicKeyRetrieval=true";
	int deptno = Integer.parseInt(request.getParameter("deptno"));
	String sql = "delete from dept where deptno=?";
	Class.forName(driver);
	Connection conn = null;
	PreparedStatement pstmt = null;
	try{
		conn = DriverManager.getConnection(url,"root","mysql");
		pstmt = conn.prepareStatement(sql);
		pstmt.setInt(1,deptno);
		int result = pstmt.executeUpdate();
		if(result>0){%>
			<script type="text/javascript">
				alert("삭제 성공");
				location.href="select.jsp";
			</script>
		

		
<%}
		else
			out.println("삭제 실패");
		}catch(Exception e){%>
		<script type="text/javascript">
			alert("실패");
			history.back)();
		</script>
<% 	}finally{
		pstmt.close();
		conn.close();
	}
	%>
</body>
</html>