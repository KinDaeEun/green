package ch14;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;
public class ChatClient {
	public static void main(String[] args) throws UnknownHostException, IOException {
		Scanner sc = new Scanner(System.in);
		System.out.println("연결할 ip");
		String ip = sc.nextLine();
		System.out.println("전달할 메세지");
		String msg = sc.nextLine();
		Socket client = new Socket(ip, 7002);
		OutputStream os = client.getOutputStream();
		BufferedWriter bw = 
				new BufferedWriter(new OutputStreamWriter(os));
		bw.write(msg); // 데이터 보내기
		bw.flush();    // 밀어내기
		os.close(); bw.close(); client.close();
		sc.close();
	}
}
