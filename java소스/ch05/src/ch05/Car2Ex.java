package ch05;

class Car2 {
	String kind;
	String color;

	void disp() {
		System.out.println("종류: " + kind);
		System.out.println("색갈: " + color);
	}
	static void m(int x) {
		System.out.println(x);
	}
}

public class Car2Ex {
	public static void main(String[] args) {
		Car2 c1 = new Car2();
		c1.kind = "벤츠";
		c1.color = "BMW";
		c1.disp();
		
		System.out.println("==============");
		
		int x = 4;
		Car2 c2  = new Car2();
		c2.m(x);
		//static
		Car2.m(x);
	}
}
