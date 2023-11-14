package ch07;

public class Car3 {
	String color = "빨강";
	int door;
	void drive() {
		System.out.println("달려라 달려");
	}
	void stop() {
		System.out.println("잠깐 멈춰");
	}
}
class FireEngine3 extends Car3{
	String color = "파랑";
	void drive() {

		System.out.println("물을 싣고 달려");
	}
	void water() {
		System.out.println("물 뿌려서 불 꺼야지");
	}
}

class Ambulance3 extends Car3{
	void drive() {
		System.out.println("환자를 싣고 달려");
	}
	void siren() {
		System.out.println("싸이렌을 울린다");
	}
}