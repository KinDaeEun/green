<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.sql.*,ch08.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="../common.css">
</head>
<body>
<%
	int deptno = Integer.parseInt(request.getParameter("deptno"));
	String driver = "oracle.jdbc.OracleDriver";
	String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
	String sql = "select * from dept where deptno="+deptno;
	Class.forName(driver);
	Connection conn = DriverManager.getConnection(url,"scott","tiger");
	Statement stmt = conn.createStatement();
	ResultSet rs = stmt.executeQuery(sql);
	rs.next();//목록에서 건너온 부서므로 반드시 한건 존재한다
	Dept dept = new Dept();
	dept.setDeptno(deptno);
	dept.setDname(rs.getString("dname"));
	dept.setLoc(rs.getString("loc"));
	pageContext.setAttribute("dept",dept);
	rs.close();
	stmt.close();
	conn.close();
	%>
	<form action="deptUpdate.jsp" method="post">
		<input type="hidden" name="deptno" value="${dept.deptno }">
		<table>
			<caption>부서정보 수정</caption>
			<tr>
				<th>부서코드</th>
				<td>${dept.deptno }</td>
			</tr>
			<tr>
				<th>부서명</th>
				<td><input type="text" name="dname" value="${dept.dname }" required="required" autofocus="autofocus"></td>
			</tr>
			<tr>
				<th>근무지</th>
				<td><input type="text" name="loc" value="${dept.loc }" required="required"></td>
			</tr>
			<tr><th colspan="2"><input type="submit" value="수정"></th></tr>
		</table>	
	</form>
</body>
</html>