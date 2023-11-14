package ch05;

class Car3 {
	String kind; // 객체를 생성해야 사용가능, instance변수
	static String color; // static 정적, class변수
	void disp() {
		System.out.println("종류: "+kind);
		System.out.println("색갈: "+color);
		
	}

}

public class Car3Ex {
	public static void main(String[] args) {
		Car3.color = "보라";

		Car3 c1 = new Car3();
		c1.kind = "BMW";
		
		c1.disp();

		Car3 c2 = new Car3();
		c2.kind = "벤츠";
		c2.color = "파란";
		c2.disp();

		Car3 c3 = new Car3();
		c3.kind = "현대";
		System.out.println(c3.color);
		c3.disp();

	}
}
