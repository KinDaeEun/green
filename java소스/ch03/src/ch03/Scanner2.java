package ch03;

import java.util.Scanner;

public class Scanner2 {
	public static void main(String[] args) {
		// 콘솔에 입력한 것을 스캐너를 이용하여 읽겠다
		// 숫자만 == != 사용가능
		Scanner sc = new Scanner(System.in);
		int num = 0;
		do {
			System.out.println("숫자를 입력하세요");
			num = sc.nextInt();// 정수만 읽고 enter 무시
			System.out.println("입력한 숫자: " + num);
		} while (num !=0);
		System.out.println("프로그램 종로");
		sc.close();
	
		
	}
}
