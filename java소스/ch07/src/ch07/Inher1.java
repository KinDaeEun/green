package ch07;
class A1{
	int k1 = 7;
	void prn() {
		System.out.println("부모 메서드");
	}
}
class A2 extends A1{ //extends 부모클래스. 부모의 변수와 메서드를 자기것 처럼 사용
	int k2 = 12;
	void m2() {
		System.out.println("자식 메서드");
	}
}
public class Inher1 {
	public static void main(String[] args) {
		A2 a = new A2();
		System.out.println(a.k1);
		System.out.println(a.k2);
		a.prn();
		a.m2();
	}
}
