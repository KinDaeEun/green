package ch05;

class A {
	static int x;
	int y;

	void a1() {
		x++;
		y++;
		System.out.println("x = " + x + ", y = " + y);
	}
}

public class Static1Ex {
	public static void main(String[] args) {
		A a1 = new A();
		A a2 = new A();
		A a3 = new A();
		A a4 = new A();
		A a5 = new A();
		A a6 = new A();

		a1.a1();
		a2.a1();
		a3.a1();
		a4.a1();
		a5.a1();
		a6.a1();

	}
}
