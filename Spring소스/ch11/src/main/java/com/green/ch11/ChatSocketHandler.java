package com.green.ch11;
import java.util.Collection;
import java.util.*;
import org.springframework.web.socket.CloseStatus;
import org.springframework.web.socket.TextMessage;
import org.springframework.web.socket.WebSocketSession;
import org.springframework.web.socket.handler.TextWebSocketHandler;
public class ChatSocketHandler extends TextWebSocketHandler {
	// 접속한 클라이언트의 WebSession에 대한 정보를 메모리 저장
	private Map<String, WebSocketSession> users = 
			new HashMap<String, WebSocketSession>();
	// 연결됐을 때 연결된 client정보를 저장(map)
	public void afterConnectionEstablished(WebSocketSession session) throws Exception {
		users.put(session.getId(), session);
	}
	// 연결이 끊어 졌을 때 : map에서 제거
	public void afterConnectionClosed(WebSocketSession session, CloseStatus status) throws Exception {
		users.remove(session.getId());
	}
	// 메세지가 왔을 때 : 연결된 모든 클라이언트에게 메세지 전송
	protected void handleTextMessage(WebSocketSession session, TextMessage message) throws Exception {
		Collection<WebSocketSession> sessions = users.values();
		for(WebSocketSession ws : sessions) {
			ws.sendMessage(message);
		}
	}
}