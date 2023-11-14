package ch06;

class B5 {
	static String call(String color) {
		return color;
	}
}

public class Return5 {
	public static void main(String[] args) {
		String[] colors = { "빨강", "주황", "노랑", "초록", "파랑", "남색", "보라" };
		for (String c : colors) {
			System.out.println(B5.call(c));
		}
	}
}
