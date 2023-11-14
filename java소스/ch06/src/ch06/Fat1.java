package ch06;

import java.util.Scanner;

public class Fat1 {
	static int fat(int num) {
		int sum = 1;
		for (int i = 1; i <= num; i++) {
			sum *= i;
		}
		return sum;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = 0;
		do {
			System.out.println("계승값을 입력하세요");
			num = sc.nextInt();
			System.out.println(fat(num));
		} while (num != 0);

		sc.close();
	}

}
