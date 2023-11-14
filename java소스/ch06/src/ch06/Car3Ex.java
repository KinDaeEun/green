package ch06;

class Car3 {
	Car3() {
		this("BMW"); // 생성자의 첫재줄에 있어야 함
		System.out.println("매개변수 없다");
	}

	Car3(String kind) {
		this(kind, "파랑");
		System.out.println("매개변수 1개" + kind);
	}

	Car3(String kind, String color) {
		System.out.println("매개변수 2개" + kind + ", " + color);
	}

	void prn() {
		System.out.println("대박");
	}
}

public class Car3Ex {
	public static void main(String[] args) {
		Car3 car = new Car3();
		car.prn();
	}
}
