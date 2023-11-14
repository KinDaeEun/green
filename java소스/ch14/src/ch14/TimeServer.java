package ch14;

import java.io.*;
import java.net.*;
import java.util.GregorianCalendar;

public class TimeServer {
	public static void main(String[] args) throws IOException {
		ServerSocket ss = new ServerSocket(7000);
		try {
			System.out.println("서버 작동중");
			while (true) {
				Socket client = ss.accept();
				OutputStream os = client.getOutputStream();
				ObjectOutputStream oos = new ObjectOutputStream(os);
				oos.writeObject(new GregorianCalendar());
				oos.flush();
				os.close();
				oos.close();
				client.close();
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			ss.close();
		}
	}
}
