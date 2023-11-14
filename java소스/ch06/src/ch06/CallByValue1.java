package ch06;

class C1 {
	static void m1(int x, int y) {
		x += 7;
		y += 7;
		System.out.println("x=" + x);
		System.out.println("y=" + y);
	}
}

public class CallByValue1 {
	public static void main(String[] args) {
		int x = 10, y = 10; //데이터가 기본형인 경우
		C1.m1(x, y); //전달되는 것은 값 10,10
		System.out.println(x+" "+y);
	}
}
