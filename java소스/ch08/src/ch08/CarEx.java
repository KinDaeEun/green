package ch08;

abstract class Car {
	int x = 10;

	abstract void move();
}

class Ambulance extends Car {
	void move() {
		System.out.println("환자를 싣고 달린다");
	}
}

class FireEngine extends Car {
	void move() {
		System.out.println("싸이렌을 울리고 달린다");
	}
}

class Bus extends Car {
	void move() {
		System.out.println("승객을 싣고 달린다");
	}
}

public class CarEx {
	public static void main(String[] args) {
		Car[] cars = { new Ambulance(), new FireEngine(), new Bus() };
		for (Car car : cars) {
			System.out.println(car.x);
			car.move();
		}
	}
}
