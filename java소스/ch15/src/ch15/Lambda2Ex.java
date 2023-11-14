package ch15;

@FunctionalInterface
interface MyFun2 {
	void method(int x);
}

public class Lambda2Ex {
	public static void main(String[] args) {
		MyFun2 mf2;

		mf2 = (x) -> {
			int result = x * 5;
			System.out.println("결과" + result);
		};
		mf2.method(4);

		mf2 = (x) -> {
			System.out.println("결과" + x * 7);
		};
		mf2.method(5);

		mf2 = x -> System.out.println("결과" + x * 6);
		mf2.method(7);
	}
}
