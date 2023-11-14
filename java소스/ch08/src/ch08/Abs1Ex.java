package ch08;
abstract class B1{
	void method1() {
		System.out.println("일반 메서드");
	}
	abstract void method2();
}
class B2 extends B1{
	void method2(){
		System.out.println("대박");
	}
}
class B3 extends B1{
	void method2() {
		System.out.println("사건");
	}
}
	

public class Abs1Ex {
	public static void main(String[] args) {
//		B1[] abs = {new B2(), new B3()};
		B1[] abs = new B1[2];
		abs[0] = new B2();
		abs[1] = new B3();
		for(B1 b: abs) {
			b.method2();
		}
	}
}
