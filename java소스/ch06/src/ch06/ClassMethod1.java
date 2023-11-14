package ch06;
class E2{
	void m1() { //instance  method
		System.out.println("대박");
	}
	static void m2() { //class method
		System.out.println("쪽박");
	}
}
public class ClassMethod1 {
	public static void main(String[] args) {
		E2 e = new E2();
		e.m1();
		
		E2.m2();
	}
}
