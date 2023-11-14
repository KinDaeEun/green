package ch03;

public class While5 {
	public static void main(String[] args) {
		int evenSum = 0, oddSum = 0;
		int i = 0;
		
		while (i <= 100) {
			if (i % 2 == 0) {
				evenSum += i;
			} else {
				oddSum += i;
			}
			i++;
		}
		int sum = evenSum + oddSum;
		System.out.printf("짝수의 합은: %d, 홀수의 합은:%d, 총합은%d", 
				evenSum, oddSum, sum);
	}
}
