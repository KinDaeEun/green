package ch07;

class H1 {
	int x = 1000;

	void display() {
		System.out.println("상위클래스 H1의 display() 메소드 입니다");
	}
}

class H2 extends H1 {
	int x = 2000;

	void display() {
		System.out.println("하위클래스 H2의 display() 메소드 입니다");
	}

	void write() {
		this.display();
		super.display();
		System.out.println("H2 클래스 객체의 x 값은 : " + x);
		System.out.println("H1 클래스 객체의 x 값은 : " + super.x);
	}
}

class InheritenceSuper {
	public static void main(String args[]) {
		H2 h = new H2();
		h.write();
	}
}