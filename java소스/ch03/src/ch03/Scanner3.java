package ch03;

import java.util.Scanner;

public class Scanner3 {
	public static void main(String[] args) {
		// 콘솔에 입력한 것을 스캐너를 이용하여 읽겠다
		// 숫자만 == != 사용가능
		Scanner sc = new Scanner(System.in);
		String str = "";
		int num = 0;
		do {
			System.out.println("숫자를 입력하세요");
//			num = sc.nextInt();// 정수만 읽고 enter 무시
			num = Integer.parseInt(sc.nextLine());
			System.out.println("입력한 숫자: " + num);
			
			System.out.println("문자열을 입력하세요");
			str = sc.nextLine();// 문자열 한 줄 읽기 :enter 읽음
			System.out.println("입력한 문자열: " + str);
			
		} while (!str.equals("x"));
		System.out.println("프로그램 종로");
		sc.close();
		
	}
}
