package ch06;

class D2 {
	static void swap(int[] x) {
		int temp = x[0];
		x[0] = x[1];
		x[1] = temp;
		System.out.printf("x[0]:%d, x[1]:%d\n", x[0], x[1]);
	}
}

public class CallByRef2 {
	public static void main(String[] args) {
		int[] x = { 12, 25 };
		D2.swap(x);
		System.out.printf("x[0]:%d, x[1]:%d", x[0], x[1]);
	}
}
