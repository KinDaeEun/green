package ch06;

class Box {
	static int cal(int x) {
		return x * x;
	}

	static int cal(int x, int y) {
		return x * y;
	}

	static int cal(int x, int y, int z) {
		return x * y * z;
	}
}

public class OverLoading3 {
	public static void main(String[] args) {
		System.out.println("정사각형 넓이: " + Box.cal(5));
		System.out.println("직사각형 넓이: " + Box.cal(5, 6));
		System.out.println("정육면체 부피: " + Box.cal(5, 6, 7));
	}
}
