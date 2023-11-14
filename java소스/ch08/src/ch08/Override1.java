package ch08;
class A1{
	void m1() {
		System.out.println("난 부모 메서드");
	}
}
class A2 extends A1{
	void m1() {
		System.out.println("대박사건");
	}
	void m2() {
		System.out.println("m2");
	}
}
class A3 extends A1{
	void m1() {
		System.out.println("난 자식 메서드");
	}
}
public class Override1 {
	public static void main(String[] args) {
		//부모를 선언하고 자식을 생성하여 대입하면
		A1 k1 = new A2();
		A1 k2 = new A3();
		
		//부모 메서드에 있는 메서드만 실행 간으한데 내용은 자식 메서드

		k1.m1();
		k2.m1();
	}
}
