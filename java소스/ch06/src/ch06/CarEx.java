package ch06;

class Car {
	String kind, color;
	int displacement;

	Car(String kind, String color, int displacement) {
		this.kind = kind;
		this.color = color;
		this.displacement = displacement;
	}

	void prn() {
		System.out.println("==================");
		System.out.println("종류: " + kind);
		System.out.println("색깔: " + color);
		System.out.println("배기량: " + displacement);
	}

}

public class CarEx {
	public static void main(String[] args) {
		Car c1 = new Car("아우디", "검은색", 1000);
		Car c2 = new Car("BMW", "파란색", 2000);
		Car c3 = new Car("현대", "흰색", 3000);

		Car[] cars = { c1, c2, c3 };
		for (Car c : cars) {
			c.prn();
		}
	}
}
