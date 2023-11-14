package ch13;

import java.io.*;

public class Buffer1 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("이름을 입력하세요");
		String name = br.readLine();
		System.out.println("주소를 입력하세요");
		String addr = br.readLine();
		System.out.println(name+"님"+addr+"에 사시는 군요");
		br.close();
	}
}
