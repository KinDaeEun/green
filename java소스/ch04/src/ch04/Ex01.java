package ch04;

public class Ex01 {
	public static void main(String[] args) {
		int[] score = { 76, 45, 34, 89, 100, 50, 90, 92 };
		int sum = 0, max = score[0], min = score[0];
		for (int i = 0; i < score.length; i++) {
			sum += score[i];
			if (max < score[i])
				max = score[i];
			else if (min > score[i])
				min = score[i];
		}
		System.out.println(sum);
		System.out.println(sum / (double)score.length);
		System.out.println(max);
		System.out.println(min);

	}
}
