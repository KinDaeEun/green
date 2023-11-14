package ch07;

public class Car2 {
	// 포함: 다른 클래스(객체)를 변수로 사용

	
	private Engine eg;
	private String color;

	Car2(Engine eg, String color) {
		this.eg = eg;
		this.color = color;
	}

	void print() {
		eg.print();
		System.out.println("색깔: " + color);
	}

}
