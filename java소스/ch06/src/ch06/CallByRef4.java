package ch06;

class D4 {
	int x = 0;
	int y= 0;
	void m1() {

		x += 11;
		y += 22;
		System.out.printf("x:%d, y:%d\n",x,y);
	}
}

public class CallByRef4 {
	public static void main(String[] args) {

		D4 d4 = new D4();
//		d4.x = 10;
//		d4.y = 20;//같이 변경됨
		System.out.printf("x:%d, y:%d\n",d4.x,d4.y);
		d4.m1();//참조변수를 전달하는 것은 주소
		System.out.printf("x:%d, y:%d",d4.x,d4.y);

	}
}
