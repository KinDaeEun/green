 package ch08;
interface C1{  //객체를 생성할 수 없다
	int k = 7; //멤버변수는 public static final 생략
	void m1(); //모든 메서드는 public abstract 생략
	void m2();
}
class C2 implements C1{
	public void m1(){
		System.out.println("허걱 ~ "+C1.k);
	}
	public void m2() {
		System.out.println("헐 ~");
	}
}
public class Inter1Ex {
	public static void main(String[] args) {
		C1 c = new C2();
		c.m1();
		c.m2();
	}
}
