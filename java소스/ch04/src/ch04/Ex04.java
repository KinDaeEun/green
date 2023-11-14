package ch04;

public class Ex04 {
	public static void main(String[] args) {
		int[][] arr = { { 5, 5, 5, 5, 5 }, { 10, 10, 10, 10, 10 },
				      { 20, 20, 20, 20, 20 }, { 30, 30, 30, 30, 30 } };
		int sum = 0;
		int total = 0;
		for (int ar[] : arr) {
			for (int a : ar) {
				sum += a;
				System.out.print(a + "\t");
			}
			System.out.println("합계: " + sum);
			total += sum;
			sum = 0;
		}
		System.out.println("총합: " + total);
	}
}
