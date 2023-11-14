
<%@page import="javax.naming.*,java.sql.*,javax.sql.*"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
	Context ctx = new InitialContext();
	String sql = "insert into dept values(31,'울보팀','제주')";
	DataSource ds = (DataSource)ctx.lookup("java:comp/env/jdbc/OracleDB");
	Connection conn = ds.getConnection();
	//여러 테이블에서 테이터를 입력/수정/삭제를 해야할 때
	//auto commit금지 default auto commit
	conn.setAutoCommit(false);
	Statement stmt = conn.createStatement();
	int result = stmt.executeUpdate(sql);
	if(result>0){
		out.println("입력성공");
		conn.commit();
	}else{
		out.println("입력실패");
		conn.rollback();
	}
	conn.setAutoCommit(true);
	stmt.close();
	conn.close();
%>
</body>
</html>