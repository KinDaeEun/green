package ch06;

class Juice {
	Juice(String apple, String peach, String grape) {
		this(apple, peach);
		System.out.println("맴버변수 3개" + apple + peach + grape);
	}

	Juice(String apple, String peach) {
		this(apple);
		System.out.println("맴버변수 2개" + apple + peach);
	}

	Juice(String apple) {
		this();
		System.out.println("맴버변수 1개" + apple);
	}

	Juice() {
		System.out.println("맴버변수 없다");
	}
}

public class JuiceEx {
	public static void main(String[] args) {
		Juice ju = new Juice("사과", "복숭아", "포도");
		
	}
}
