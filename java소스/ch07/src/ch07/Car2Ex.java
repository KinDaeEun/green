package ch07;

public class Car2Ex {
	public static void main(String[] args) {


		
		Engine eg1 = new Engine(1000, "a");
		Car2 c1 = new Car2(eg1, "파랑");

		eg1.print();
		c1.print();

	}
}
