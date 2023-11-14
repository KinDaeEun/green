package ch05;

public class Car1 { // 클래스 헤더, 선언부
	String color; // (멤버)변수, 필드, 속성, 전역변수
	int displacement;// 정수0, 실수0.0, boolean false, 문자(열) null; 참조기 자동 초기화 기본형 초기화 안 하면 애러
	String kind;

	void speedUp() {
		System.out.println("속도를 올리다");
	}

	void stop() { // 메서드 헤더 void(반환형) aptjemaud() 메서드 선언부
		System.out.println("차를 멈춘다: " + color);
	}

	void disp() {
		System.out.println("색갈: " + color);
		System.out.println("배기량: " + displacement);
	}
}
