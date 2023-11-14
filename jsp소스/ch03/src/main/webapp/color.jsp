<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
@import url(common.css);
</style>

</head>
<body>
	<!-- <form action="color_result.jsp">
		<table>
			<tr>
				<th>배경 색깔 선택</th>
				<td><select name = "color">
					<option>red</option>
					<option>orange</option>
					<option>yellow</option>
					<option>green</option>
					<option>blue</option>
					<option>navy</option>
					<option>violet</option>
				</select>
			</tr>
			<tr>
				<th colspan="2"><input type="submit"></th>
			</tr>
		</table>
	</form>  -->
	<form name="frm">
		<table>
			<tr>
				<th>배경 색깔 선택</th>
				<td><select name="color">
						<option>red</option>
						<option>orange</option>
						<option>yellow</option>
						<option>green</option>
						<option>blue</option>
						<option>navy</option>
						<option>violet</option>
				</select>
			</tr>
			<tr>
				<th colspan="2"><input type="button"  onclick="bgCh()" value="색깔 변경"></th>
			</tr>
		</table>
	</form>


</body>
<script>
	function bgCh() {
		
		document.body.style.backgroundColor = frm.color.value;
	}
</script>
</html>