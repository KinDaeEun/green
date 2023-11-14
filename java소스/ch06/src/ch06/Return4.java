package ch06;

class B4 {
	static String greeting(String name) {
		return name + "님! 안녕하세요";
	}
}

public class Return4 {
	public static void main(String[] args) {
		String[] name = { "하니", "보검", "뷔", "제니" };

		for (String n : name) {
			System.out.println(B4.greeting(n));
		}
	}
}
