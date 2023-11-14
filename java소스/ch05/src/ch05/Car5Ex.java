package ch05;

class Car5 {
	String kind;
	int displacement;
	String color;

	// 생성자의 매개변수의 갯수나 데이터형이 다르면 여러개 만들 수 있다
	// 생성자 overloading
	Car5() {
	}

	Car5(String k) {
		kind = k;
	}

	Car5(int d) {
		displacement = d;
	}

	Car5(String k, int d) {
		kind = k;
		displacement = d;
	}

	Car5(String k, int d, String c) {
		kind = k;
		displacement = d;
		color = c;
	}

	void disp() {
		System.out.println("종류: " + kind);
		System.out.println("배기랑: " + displacement);
		System.out.println("색갈: " + color);
		System.out.println("====================");
	}

}

public class Car5Ex {
	public static void main(String[] args) {
		Car5 c1 = new Car5();
		c1.kind = "소나타";
		c1.displacement = 1500;
		c1.color = "빨강";

		Car5 c2 = new Car5("말두타");
		c2.displacement = 2000;
		c2.color = "노랑";

		Car5 c3 = new Car5(2300);
		c3.kind = "벤트";
		c3.color = "파란";

		Car5 c4 = new Car5("아우디", 2500);
		c4.color = "보라";

		Car5 c5 = new Car5("BMW", 3000, "초록");

		c1.disp();
		c2.disp();
		c3.disp();
		c4.disp();
		c5.disp();
	}
}
