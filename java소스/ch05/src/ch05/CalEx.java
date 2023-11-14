package ch05;

class Cal {
	int x, y;
	
	void cal() {
		System.out.println(x + "+" + y + "=" + (x + y));
		System.out.println(x + "-" + y + "=" + (x - y));
		System.out.println(x + "*" + y + "=" + (x * y));
		System.out.println(x + "/" + y + "=" + (x / y));
		System.out.println("====================");
	}
}
//접근제어자
public class CalEx {
	public static void main(String[] args) {
		Cal c1 = new Cal();
		c1.x = 12;
		c1.y = 4;
		c1.cal();
		
		Cal c2 = new Cal();
		c2.x = 10;
		c2.y = 3;
		c2.cal();
	}
}
