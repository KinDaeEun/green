package ch14;
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;
public class ChatServer {
	public static void main(String[] args) {
		ServerSocket ss = null;
		try {
			ss = new ServerSocket(7002); // 통신할 서버 생성
			System.out.println("서버 실행 중");
			while(true) {
				Socket client = ss.accept(); // 클라이언트 연결 대기
//				고객이 보낸 데이터를 읽을 준비
				DataInputStream dis = new DataInputStream(
					client.getInputStream());
//				한줄씩 읽어서 처리
				BufferedReader br = new BufferedReader(
						new InputStreamReader(dis));
				System.out.println(client.getInetAddress()+
						" => "+br.readLine());
				dis.close(); br.close(); client.close();
			}
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}