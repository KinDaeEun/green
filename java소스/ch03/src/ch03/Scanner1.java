package ch03;

import java.util.Scanner;

public class Scanner1 {
	public static void main(String[] args) {
		// 콘솔에 입력한 것을 스캐너를 이용하여 읽겠다
		// 숫자만 == != 사용가능
		
		Scanner sc = new Scanner(System.in);
		String str = "";
		do {
			System.out.println("문자열을 입력하세요");
			str = sc.nextLine();// 문자열 한 줄 읽기 (enter 포함)
			System.out.println("입력한 문자열: " + str);
			// "문자열".equals("문자"): 문자열은 같다
		} while (!str.equals("x"));
		
		System.out.println("프로그램 종로");
		sc.close();
		
	}
}
