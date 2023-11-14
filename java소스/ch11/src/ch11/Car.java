package ch11;

public interface Car {
	void move();
	
}
class Bus implements Car{
	public void move() {
		System.out.println("승객 40명 싣고 달린다");
	}
	void prn() {
		System.out.println("난 버스야");
	}
}
class Taxi implements Car{
	public void move() {
		System.out.println("난 총알처럼 달린다");
	}
}
class FireEngine implements Car{
	public void move() {
		System.out.println("난 불끄러 달린다");
	}
}
class Ambulance{
	public void move() {
		System.out.println("난 환자 싣고 달린다");
	}
}