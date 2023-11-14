package ch07;

class I1 {
	// F1() {}
	I1(String str) {
		System.out.println("매개변수가 있는 생성자" + str);
	}

	void print() {
		System.out.println("대박 ");
	}
}

class I2 extends I1 {
	I2(String str) {
		super(str); // super() 부모 생성자 호출
		System.out.println("난 자식 생성자");
	}

	void disp() {
		System.out.println("사건");
	}
}

public class SuperEx {
	public static void main(String[] args) {
		I2 i = new I2("헐 ~");
		i.disp();
		i.print();

	}
}
