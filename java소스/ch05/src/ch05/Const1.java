package ch05;

public class Const1 {
	// 메개변수의 갯수가 다르거나 데이터형이 다르면 된다. 이름은 클래스명과 같다
	Const1() {
		System.out.println("매개변수가 없는 생성자");
	}

	Const1(int x) {
		System.out.println("매개변수가 숫자 1개: " + x);
	}

	Const1(int x, int y) {
		System.out.println("매개변수가 2개: " + x + ", " + y);
	}

	Const1(String s) {
		System.out.println("배개변수가 문자: " + s);
	}
}
