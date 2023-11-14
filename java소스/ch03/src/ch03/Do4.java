package ch03;

import java.io.IOException;

public class Do4 {
	public static void main(String[] args) throws IOException {
		//do~while문 사용하면 원하는 값이 올 때까지 계속 실행
		int num = 0;
		do {
			System.out.println("짝수르 입력하세요");
			//7입력하고 enter(CR(13)+LF(10))  13-48 => -35, 10-48 =>38
			num = System.in.read() - '0';
			System.in.read(); //CR 읽고 저장 안 함
			System.in.read();//Lf 읽고 저장 안 함
		} while (num % 2 != 0);//홀수면 다시 입력 받아
		System.out.println("입력한 짝수는: " + num);
	}
}
