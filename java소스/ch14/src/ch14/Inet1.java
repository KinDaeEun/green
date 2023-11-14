package ch14;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class Inet1 {
	public static void main(String[] args) throws UnknownHostException {
		InetAddress addr = InetAddress.getByName("www.naver.com");
		System.out.println("addr: "+addr.getHostAddress());
	}
}
