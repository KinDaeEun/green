package ch03;

public class Ex02 {
	public static void main(String[] args) {
		int sum = 0, totalSum = 0;
		for(int i = 0; i<=10;i++) {
			sum+=i;
			totalSum+=sum;
			System.out.println(i+"까지 합: "+sum);
		}
		System.out.println("누적 합계: "+ totalSum);
	}
}
