package ch03;

import java.io.IOException;

public class Do3 {
	public static void main(String[] args) throws IOException {
		System.out.println("보고 싶은 구구단 번호는?");
		int num = System.in.read() - '0';
		int i = 0;
		do {
			System.out.printf("%d * %d = %d\n", num, i, num * i);
			i++;
		} while (i <= 9);
	}
}
