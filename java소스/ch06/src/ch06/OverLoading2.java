package ch06;

class F2 {
	static int multip(int x) {
		return x * x;
	}

	static int multip(int x, int y) {
		return x * y;
	}

	static double multip(double x, double y) {
		return x * y;
	}

	static String multip(String name) {
		return "안녕" + name + "님";
	}
}

public class OverLoading2 {
	public static void main(String[] args) {
		System.out.println(F2.multip(3));
		System.out.println(F2.multip(3, 4));
		System.out.println(F2.multip(3.3, 4.4));
		System.out.println(F2.multip("ㅁㅁㅁ"));
	}
}
