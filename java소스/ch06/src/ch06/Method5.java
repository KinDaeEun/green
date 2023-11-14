package ch06;

public class Method5 {
	public static void main(String[] args) {
		boolean scope = true;
		int num = 0;
		for (int i = 0; i < 10; i++) {
			if (scope) {
				num++;
				System.out.println(num + ": " + scope);
			} else {
				num *= 2;
				System.out.println(num + ": " + scope);
			}
			simple(num);
			scope = !scope;
		}
	}

	private static void simple(int num) {
		// TODO Auto-generated method stub
		System.out.println("현재: " + num);
	}
}
