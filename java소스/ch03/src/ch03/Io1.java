package ch03;

import java.io.IOException;

public class Io1 {
	public static void main(String[] args) throws IOException {
		System.out.println("정수 한자리를 입력하세요");
		// read 문자 한글자를 읽는 다
		// 문자는 ascii코드에 해당하는 십진수 정수를 num에 대입
		int num = System.in.read() - '0' ;
		System.out.println("입력한 정수:" + num);
	}
}
