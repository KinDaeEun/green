<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.sql.*,java.util.*,ch08.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%	List<Dept> list = new ArrayList<>();
	String driver = "oracle.jdbc.OracleDriver";
	String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
	String sql = "select * from dept order by deptno";
	Class.forName(driver);//driver load
	//DB연결
	Connection conn =  DriverManager.getConnection(url,"scott","tiger");
	//sql을 실행할 객체 생성
	Statement stmt = conn.createStatement();
	//조회를 실행하고 그 결과를 rs에 저장
	ResultSet rs = stmt.executeQuery(sql);
	while(rs.next()){
		Dept dept = new Dept();
		dept.setDeptno(rs.getInt("deptno"));
		dept.setDname(rs.getString("dname"));
		dept.setLoc(rs.getString("loc"));
		list.add(dept);
	}
	request.setAttribute("list", list);
	rs.close();
	stmt.close();
	conn.close();
%>
<jsp:forward page="select_result.jsp"></jsp:forward>
</body>
</html>