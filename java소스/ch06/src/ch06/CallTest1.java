package ch06;

class E1 {
	int x, y;

	void m1(int x, int y) {
		x += 10;
		y += 10;
		System.out.println("m1 x = " + x);
		System.out.println("m1 y = " + y);
	}

	void m2(E1 e) {
		e.x += 10;
		e.y += 10;
		System.out.println("m2 x = " + e.x);
		System.out.println("m2 y = " + e.y);
	}
}

public class CallTest1 {
	public static void main(String[] args) {
		int x = 8;
		int y = 8;

		E1 e = new E1();
		e.x = 8;
		e.y = 8;
		e.m1(x, y);
		e.m2(e);

		System.out.println("d x = " + x);
		System.out.println("d y = " + y);
		System.out.println("r x = " + e.x);
		System.out.println("r y = " + e.y);
	}
}
