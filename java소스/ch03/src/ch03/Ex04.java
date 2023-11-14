package ch03;

import java.util.Scanner;

public class Ex04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("");

		int sum = 0;
		int num = sc.nextInt();
		
		while (num != 0) {
			sum += num % 10;
			num /= 10;
		}
		System.out.println("자릿수 합: " + sum);
		sc.close();

	}
}
