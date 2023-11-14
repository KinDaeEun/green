package ch07;

class F1 {
	int k1 = 10;

	void m1() {
		System.out.println("난 부모 메서드");
	}
}

class F2 extends F1 {
	int k1 = 20;

	void m1() {
		System.out.println("난 자식 메서드");
	}

	void prn() { // super 부모
		System.out.println("k1 = " + super.k1);
		System.out.println("k1 = " + k1);
		super.m1();
		m1();
	}
}

public class Super1Ex {
	public static void main(String[] args) {
		F2 f2 = new F2();
		f2.prn();
	}
}
