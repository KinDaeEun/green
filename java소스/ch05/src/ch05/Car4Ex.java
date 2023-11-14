package ch05;

class Car4 {
	String kind;
	int displacement;
	String color;
	//생성자는 값을 초기화 할 때 사용, 생성자명은 클래스명과 같다
	//반환형이 없다(void 등이 없다)
	public Car4(String k, int d, String c) {
		kind = k;
		displacement = d;
		color = c;
	}

	void disp() {
		System.out.println("종류: " + kind);
		System.out.println("배기랑: " + displacement);
		System.out.println("색갈: " + color);
		System.out.println("====================");
	}
}

public class Car4Ex {
	public static void main(String[] args) {
		Car4 car1 = new Car4("소나타", 2000, "빨강");
		car1.disp();
	}
}
