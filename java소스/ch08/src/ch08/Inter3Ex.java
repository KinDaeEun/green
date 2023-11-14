package ch08;
interface E1{
	String STR = "대박사건";
	void m1();
}
interface E2 extends E1{
	void m2();
}
interface E3 extends E2{
	void m3();
}
class E4 implements E3{
	public void m1() {
		System.out.println("산딸기");
	}
	public void m2() {
		System.out.println("판딸기");
	}
	public void m3() {
		System.out.println("죽은 딸기");
	}
	void m4() {
		System.out.println("알카리 딸기");
	}
}
public class Inter3Ex {
	public static void main(String[] args) {
		E4 e = new E4();
		e.m1();
		e.m2();
		e.m3();
		e.m4();
		System.out.println(E1.STR);
	}
}
