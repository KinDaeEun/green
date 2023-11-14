package ch06;

class B1 {
	static int add(int x, int y) {
		return x + y;
	}

	static int minus(int x, int y) {
		return x - y;
	}
}

public class Return1 {
	public static void main(String[] args) {
		int x = 10;
		int y = 20;
		System.out.println(x + " + " + y + " = " + B1.add(x, y));

	}
}
