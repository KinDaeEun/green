package ch04;

public class Ex02 {
	public static void main(String[] args) {
		// 정렬
		int[] score = { 50, 40, 10, 20 };
		int temp = 0;
		for (int i = 0; i < score.length; i++) {
			for (int j = i + 1; j < score.length; j++) {
				if (score[i] > score[j]) {
					temp = score[i];
					score[i] = score[j];
					score[j] = temp;

				}
			}
		}

		for (int i = 0; i < score.length; i++) {
			System.out.print(score[i] + " ");
		}
	}
}
