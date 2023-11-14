package ch07;

class D1 {
	D1(){
		System.out.println("할아버지 생성자");
	}
	void m1() {

		System.out.println("할아버지 메서드");
	}
}

class D2 extends D1 {
	D2() {
		System.out.println("부모생성자");
	}

	void m2() {

		System.out.println("부모 메서드");
	}
}

class D3 extends D2 {
	D3() {
		System.out.println("자식 생성자");
	}

	void m3() {

		System.out.println("자식 메서드");
	}
}

public class Inher4Ex {
	public static void main(String[] args) {
	D3 d3 = new D3();
	d3.m1();
	d3.m2();
	d3.m3();
	}
}
