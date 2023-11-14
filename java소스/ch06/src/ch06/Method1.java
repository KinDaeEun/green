package ch06;

public class Method1 {
	// 메서드 앞에 static 붙으면 클래스 메서드
	// 객체생성없이 클래스명.메서드()으로 사용 가능
	static void add(int x, int y) { // void 비어있다,반환할 것이 없다 (2)
		System.out.printf("%d + %d = %d\n", x, y, x + y);

	}
	//     정수로 지정
	static int miuns(int x, int y) { // minus(x,y)에 반환
		return x - y;

	}

	public static void main(String[] args) {
		Method1 m = new Method1();//(1)
		for (int i = 0; i < 1; i++) {
			int x = (int) (Math.random() * 10) + 1;
			int y = (int) (Math.random() * 10) + 1;
			
			m.add(x, y);//1

			// 실행문(main이 있는 클래스)이 있는 클래스명과 동일할 때는 클래스명 생략
			add(x, y);// 원래 Method1.add(x,y)(2)
			System.out.println(x + " - " + y + " = " + miuns(x, y));
		}

	}
}
