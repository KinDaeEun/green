package ch10;

import java.util.*;

public class Throws1 {
	public static void main(String[] args) {
		//throws를 하면 그 메서드를 요청한 곳으로 처리를 보낸다
		try {
			m1();
		} catch (ArithmeticException e) {
			System.out.println("0으로 못 나눠");
		}
	}

	private static void m1() throws ArithmeticException {
//		try {
		m2();
//		}catch(ArithmeticException e) {
//			System.out.println("0으로 못 나눠");
//		}
	}

	private static void m2() throws ArithmeticException {

		Scanner sc = new Scanner(System.in);
		System.out.println("정수를 입력하세요");
		int num = sc.nextInt();
		System.out.printf("100/ %d = %d\n", num, 100 / num);
		sc.close();

	}
}
