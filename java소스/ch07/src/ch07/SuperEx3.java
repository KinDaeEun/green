package ch07;

class J1 {
	int x;

	J1(int x) {
		this.x = x;
		System.out.println("부모 매개 1개");
	}

	J1(int x, int y) {
		this(x);
		System.out.println("부모 매개 2개");
	}

	void print() {
		System.out.println("x = " + x);
	}
}

class J2 extends J1 {
	J2(int x, int y) {
		super(x, y);
		System.out.println("자식 2개");
	}

	J2(int x, int y, int z) {
		this(x, y);
		System.out.println("자식 매개변수 3개");
	}
}

public class SuperEx3 {
	public static void main(String[] args) {
		J2 j = new J2(34, 45, 67);
		j.print();
	}
}
