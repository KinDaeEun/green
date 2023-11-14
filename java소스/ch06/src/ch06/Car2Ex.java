package ch06;

class Car2 {
	String color, kind;
	int door;

	Car2() {
//		color = "하양";
//		kind = "재규어";
//		door = 4;
		this("하양", "재규어", 4);
	}

	Car2(String color, String kind, int door) {
		this.color = color;
		this.kind = kind;
		this.door = door;
	}

	void prn() {
		System.out.println(color + kind + door);
	}
}

public class Car2Ex {
	public static void main(String[] args) {
		Car2 c1 = new Car2();
		c1.prn();
	}
}
