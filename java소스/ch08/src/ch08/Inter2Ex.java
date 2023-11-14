 package ch08;

interface D1 {
	void m1();
}

interface D2 extends D1 { // interface끼리는 상속할 때 implements가 아니라 extends
	void m2();
}

interface D3 {
	void m3();
}

interface D4 extends D2, D3 { // interface 다중 상속 가능
	void m4();
}

class D5 implements D4 { // implements도 다중 구현 가능
	public void m1() {
		System.out.println("김검모야");
	}

	public void m2() {
		System.out.println("이건모야");
	}

	public void m3() {
		System.out.println("허각, 허걱, 허공");
	}

	public void m4() {
		System.out.println("외불러, 배불러, 배터져");
	}
}

public class Inter2Ex {
	public static void main(String[] args) {
		D5 d5 = new D5();
		d5.m1();
		d5.m2();
		d5.m3();
		d5.m4();
		
	}
}
