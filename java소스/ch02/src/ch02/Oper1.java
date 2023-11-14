package ch02;

public class Oper1 {
	public static void main(String[] args) {
		int num1 = 4 + 5 * 2 / 2; // 9
		System.out.println("num1 = " + num1);
		int num2 = 4 + 5 / 2 * 2; // 8
		System.out.println("num2 = " + num2);

		int num3 = -5 - -3 * 8 % (4 - 2) * 3;
		System.out.println(num3);
	}
}
