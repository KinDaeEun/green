package ch07;

class C1 {
	int k1 = 1;

	C1() {
		System.out.println("부모 생성자");
	}

	void m1() {
		System.out.println("부모 메서드");
	}
}

class C2 extends C1 {
	int k2 = 7;

	C2() {
		System.out.println("자식 생성자");
	}

	void m2() {
		System.out.println("자식 메서드");
	}
}

public class Inher3Ex {
	public static void main(String[] args) {
		//변수 메서드는 상속되지만 생성잔는 상속이 아니라 부모 먼저 생생된다
//		C1 c1 = new C1();
		C2 c = new C2();
		System.out.println("k1 = "+c.k1);
		System.out.println("k2 = "+c.k2);
		c.m1();
		c.m2();
	}
}





