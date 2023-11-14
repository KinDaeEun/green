package ch06;

class A2 {
	static void divide(int x, int y) {
		System.out.println(x + " * " + y + " = " + (x * y));
	}

	void mutiply(int x, int y) {
		System.out.println(x + " / " + y + " = " + (x / y));
	}
}

public class Method4 {
	public static void main(String[] args) {
		for (int i = 0; i < 5; i++) {
			int x = (int) (Math.random() * 10) + 1;
			int y = (int) (Math.random() * 10) + 1;
			A2.divide(x, y);
		}
		A2 a = new A2();
		System.out.println("=============");
		for (int i = 0; i < 5; i++) {
			int x = (int) (Math.random() * 100) + 1;
			int y = (int) (Math.random() * 10) + 1;
			a.mutiply(x, y);
		}
	}
}
