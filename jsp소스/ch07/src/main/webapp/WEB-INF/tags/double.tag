<%@ tag language="java" pageEncoding="UTF-8"%>
<%@tag body-content="empty" %>
<%@ tag dynamic-attributes="attr" %>
<font color="${attr.color }">
	<%
		java.util.Map<String,Object> attr=(java.util.Map)jspContext.getAttribute("attr");
		int size = Integer.parseInt((String)attr.get("size"));
		for(int i=0;i<size;i++){
			out.println("=");
		}
	%>
</font><br>

