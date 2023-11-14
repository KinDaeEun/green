package ch05;

public class Const1Ex {
	public static void main(String[] args) {
		// 생성자는 객체를 만들때 사용
		// 멤버변수를 초기화 하는데 주요 목적이 있다
		//일반 실행문을 사용할 수 있다
		Const1 c1 = new Const1();
		Const1 c2 = new Const1(7);
		Const1 c3 = new Const1(7, 12);
		Const1 c4 = new Const1("대박");
	}
}
