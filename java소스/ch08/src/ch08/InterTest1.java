package ch08;

class F1 {
//	static void m1(F2 f) { // 포함관계
//		f.m1();
//	}
//}
	void m1(F3 f) { // 포함관계
		f.m1();
	}
}

class F2 {
	void m1() {
		System.out.println("대박");
	}
}

class F3 {
	void m1() {
		System.out.println("쪽박");
	}
}

public class InterTest1 {
	public static void main(String[] args) {
//		F2 f = new F2();
		F3 f = new F3();
		F1 f1 = new F1();
		f1.m1(f);

	}
}
