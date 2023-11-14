<%@page import="ch10.MemberDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%request.setCharacterEncoding("utf-8"); %>
	<jsp:useBean id="member" class="ch10.Member"></jsp:useBean>
	<jsp:setProperty property="*" name="member"/>
<%		
		MemberDao md = MemberDao.getInstance();
		int chk = md.confirm(member.getId());
		if(chk>0){%>
			<script type="text/javascript">
				alert("아이디 중복인데 왜 입력해 ");
				history.back();
			</script>
			
<%		return;//에러나면 진행 종료
			}
		int result = md.insert(member); 
		if(result>0){%>
			<script type="text/javascript">
				alert("회원 가입 성공")
				location.href = "loginForm.jsp";
			</script>
<%		}else{%>
			<script type="text/javascript">
				alert("에러")
				location.href = "joinForm.jsp";
			</script>
<%		}%>
	
</body>
</html>