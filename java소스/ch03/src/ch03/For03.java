package ch03;

public class For03 {
	public static void main(String[] args) {
		int evenSum = 0, oldSum = 0;
		for (int i = 0; i <= 100; i++) {
			if (i % 2 == 0)
				evenSum += i;
			else
				oldSum += i;
		}
		System.out.println("짝수 합: " + evenSum);
		System.out.println("홀수 합: " + oldSum);
		System.out.println("전체 합: " + (evenSum + oldSum));
	}
}
