package ch14;

import java.io.*;
import java.net.*;
import java.util.Scanner;

public class URLConn1 {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		System.out.println("url을 입력하세요");
		String addr = sc.nextLine();
		URL url = new URL(addr);//인터넷 주소 생성
		URLConnection uc = url.openConnection();//인터넷 연결
		InputStream is = uc.getInputStream();
		//한줄씩 읽어서 처리
		BufferedReader br = new BufferedReader(new InputStreamReader(is,"utf-8"));
		String str = "";
		while(true) {
			str = br.readLine();
			if(str == null)
				break;
			System.out.println(str);
		}
		sc.close();
		is.close();
		br.close();
	}
}
