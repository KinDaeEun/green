package ch06;

class C2 {
	static void swap(int x, int y) {

		int temp = x;
		x = y;
		y = temp;
		System.out.printf("x는%d, y는%d\n", x, y);
	}
}

public class CallByValue2 {
	public static void main(String[] args) {
		int x = 15; //변수에 기본형 데이터는 값이 전달
		int y = 20;
		C2.swap(x, y);
		System.out.printf("x는%d, y는%d\n", x, y);
	}
}
