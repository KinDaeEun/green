package ch10;

import java.util.Scanner;

public class Except2Ex {
	public static void main(String[] args) {
		int num1 = 0, num2 = 0;
		Scanner sc = new Scanner(System.in);
		String str = "";
		while (true) {
			System.out.println("첫번째 정수: ");
			str = sc.nextLine();
			if (str.equals("x"))
				break;

			try {
				num1 = Integer.parseInt(str);
				System.out.println("두번째 정수: ");
				num2 = Integer.parseInt(sc.nextLine());
				System.out.printf("%d / %d = %d\n", num1, num2, num1 / num2);

			} catch (ArithmeticException e) {
				System.out.println("0으로 못 나눠");
			} catch (NumberFormatException e) {
				System.out.println("숫자로 못바꾸는 데이터 입니다");
			} catch(Exception e) { //범위가 넓은 것은 아래에 위치

			}

		}

		sc.close();
		System.out.println("프로그램 종료");
		
	

	}
}
