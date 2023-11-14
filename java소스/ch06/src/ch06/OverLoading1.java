package ch06;

class F1 {
	static int add(int x, int y) {
		return x + y;
	}

	static float add(float x, float y) {
		return x + y;
	}

	static String add(String name) {
		return "안녕하세요" + name + "님 !!!";
	}
}

public class OverLoading1 {
	public static void main(String[] args) {
		System.out.println(F1.add("보검"));
		System.out.println(F1.add(12,15));
		System.out.println(F1.add(12.3f,15));

	}
}
