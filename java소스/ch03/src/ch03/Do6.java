package ch03;

import java.io.IOException;

public class Do6 {
	public static void main(String[] args) throws IOException {
		int num = 0, i = 1;
		do {
			System.out.println("보고싶은 구구단 번호 ?");
			num = System.in.read() - '0';
			System.in.read();
			System.in.read();
			if (num >= 2 && num <= 9)
				do {
					System.out.println(num + " * " + i + " = " + num * i);
					i++;
				} while (i <= 9);
			else
				System.out.println("구구단 숫자가 아닙니다");
			i =1;
		} while (num != 0);
		System.out.println("프로그램 종료");
	}
}
