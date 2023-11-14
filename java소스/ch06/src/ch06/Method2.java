package ch06;
class Method2_{
	static void multiply3(int x, int y) {
		System.out.printf("%d * %d = %d\n", x, y, x * y);
	}
}

public class Method2 {

	static void multiply(int x, int y) {
		System.out.printf("%d * %d = %d\n", x, y, x * y);
	}

	int divide(int x, int y) {
		return x / y;
	}

	public static void main(String[] args) {
		Method2 m = new Method2();
		int k1 = (int) (Math.random() * 100) + 1;
		int k2 = (int) (Math.random() * 100) + 1;
		Method2_.multiply3(k1, k2);
		
		multiply(k1,k2);
		
		System.out.println(m.divide(k1, k2));
	}
}
