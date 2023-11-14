package ch05;

import java.util.Scanner;

public class Final2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		final int CIRCLE = 1;
		final int RECTANGLE = 2;
		final int TRIANGLE = 3;
		int num = 0;
		do {
			System.out.println("1,2,3중에 입력하세요");
			num = sc.nextInt();
			if (num == CIRCLE)
				System.out.println("원입니다");
			else if (num == RECTANGLE)
				System.out.println("사각형입니다");
			else if (num == TRIANGLE)
				System.out.println("삼각형입니다");
			else
				System.out.println("숫자 1,2,3도 몰라, 혹시 바보?!");
		} while (num != 0);
		System.out.println("프로그램 종료");
		sc.close();

	}
}
