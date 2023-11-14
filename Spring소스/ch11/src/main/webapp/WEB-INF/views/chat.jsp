<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="header.jsp" %>
<!DOCTYPE html><html><head><meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
	table { height: 450px; border: 2px solid green; 
		table-layout:fixed; overflow: hidden; }
	#chatMessage { height: 400px; overflow: scroll; }
</style>
<script type="text/javascript">
	let websocket;  // 전역변수, 여러 function에서 같이 사용
	let nickname;
	$(function() {
		$('#enterBtn').click(function() {	connect();	});
		$('#exitBtn').click(function() {	disconnect();});
		$('#sendBtn').click(function() {	send();		});
	});
	function connect() {             // 공통 서버 ip servlet-context에 등록된 이름
		websocket=new WebSocket("ws://192.168.40.186:8080/ch11/chat-ws.do");
		// websock에 발생된 이벤트 처리
		websocket.onopen = onOpen;
		websocket.onmessage = onMessage;
		websocket.onclose = onClose;
	}
	function onOpen() {
		nickname = $('#nickname').val(); // 별명 가져오기
		appendMessage(nickname+"님이 입장하였습니다");
	}
	function onClose() {
		appendMessage(nickname+"님이 퇴장하였습니다");
	}
	function onMessage(event) {
		let msg = event.data; // 메세지는 event의 data속성에 들어 있음
		appendMessage(msg);
	}	
	function disconnect() {
		websocket.close();
	}
	function send() {
		let msg = $('#message').val(); // 메세지에 입력한 글 읽기
		websocket.send(nickname+"=>"+msg);
		$('#message').val("");
	}
	function appendMessage(msg) {
		$('#chatMessage').append(msg+"<br>");
		// 채팅창에 글이 꽉찬 경우에 최신글이 하단에 보이게, scrollbar를 아래로 내려라
		var objDiv = document.getElementById("chatMessage");
		objDiv.scrollTop = objDiv.scrollHeight;
	}
</script>
</head><body>
<div class="container">
<table class="table table-hover">
	<tr class="table-success"><td width="20%">별명</td>
		<td><div class="row">
				<div class="col col-auto">
					<input type="text" id="nickname" class="form-control">
				</div>
				<div class="col col-auto">
					<input type="button" id="enterBtn" value="입장" 
						class="btn btn-info btn-sm">
					<input type="button" id="exitBtn" value="퇴장" 
						class="btn btn-danger btn-sm">
				</div>
			</div></td></tr>
	<tr class="table-info"><td>메세지</td><td>
		<div class="row">
			<div class="col col-auto">
				<input type="text" id="message" class="form-control">
			</div>
			<div class="col col-auto">
				<input type="button" id="sendBtn" value="전송" 
					class="btn btn-success btn-sm">
			</div>
		</div>
	</td></tr>
	<tr class="table-warning"><td>대화영역</td>
		<td><div id="chatMessage"></div></td></tr>
</table>
</div>
</body>
</html>