package ch04;

public class Ex05 {
	public static void main(String[] args) {
		int[] unit = { 50000, 10000, 5000, 1000 };
		int money = 372000;
		for (int i = 0; i < unit.length; i++) {
			System.out.printf("%d원짜리는 %d 개\n", unit[i], money / unit[i]);
			money %= unit[i];
		}
	}
}
