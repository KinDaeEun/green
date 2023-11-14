package ch06;

class B2 {
	static int multiply(int x, int y) {
		return x * y;
	}

	static int divide(int x, int y) {
		return x / y;
	}
}

public class Return2 {
	public static void main(String[] args) {
		int x = 400, y = 20;
		System.out.println(B2.multiply(x, y));
		System.out.println(B2.divide(x, y));

	}
}
