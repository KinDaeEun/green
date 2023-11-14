package ch06;

public abstract class Car {
	String color = "빨강";
	abstract void move();
}
class FireEngine extends Car{
	public void move() {
		System.out.println("사이렌을 울리면 간다");
	}
	void rule() {
		System.out.println("불 끄는 게 역할이야");
	}
}
class Taxi extends Car{
	String color = "노란";
	int door = 4;
	public void move() {	
		System.out.println("총알처럼 간다");
	}
}
class Bus extends Car{
	int person = 40;
	public void move() {	
		System.out.println("승객을 태우고 간다");
	}
	void price() {
		System.out.println("요금이 300원 오른대");
	}
}