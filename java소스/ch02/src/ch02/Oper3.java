package ch02;

public class Oper3 {
	public static void main(String[] args) {
		byte b1 = 10, b2 = 20;
		// byte = int +int => int
		byte b3 = (byte) (b1 + b2);
		System.out.println("b3 = " + b3);
	}
}
