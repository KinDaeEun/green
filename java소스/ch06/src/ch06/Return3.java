package ch06;

class B3 {
	static void cal(int x, int y) {
		System.out.printf("%d * %d = %d\n", x, y, x * y);
		if (y == 0) {
			System.out.println("0으로 못나눠");
			return; // 메서드 종료
		}
		System.out.printf("%d / %d = %d\n", x, y, x / y);
		System.out.println("============");
	}
}

public class Return3 {
	public static void main(String[] args) {
		for (int i = 0; i < 2; i++) {
			int x = 100;
			int y = (int) (Math.random() * 2);
			B3.cal(x, y);
		}
	}
}
