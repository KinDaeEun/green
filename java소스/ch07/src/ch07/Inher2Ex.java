package ch07;

class B1 {
	static int i1 = 7;

	static void m1() {
		System.out.println("난 할아버지 메서드");
	}

}

class B2 extends B1 {
	static int i2 = 22;

	static void m2() {
		System.out.println("난 아버지 메서드");
	}
}

class B3 extends B2 {
	static int i3 = 77;

	static void m3() {
		System.out.println("난 자식 메서드");
	}
}

public class Inher2Ex {
	public static void main(String[] args) {
		System.out.println(B3.i1);
		B2.m1();
		B3.m1();
		B3.m2();
	}
}
