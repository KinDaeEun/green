package ch06;

public class CarEx {
	public static void main(String[] args) {
		Car[] cars = {new FireEngine(), new Bus(),new Taxi()};
		for(Car car:cars) {
			car.move();
			System.out.println(car.color);
		}
		
		Car c1 = new Taxi();
		System.out.println(((Taxi)c1).door);
		System.out.println(c1.color);
	}
}
