package ch04;

public class Arr4 {
	public static void main(String[] args) {
		int[] score = { 26, 32, 54, 75, 34 };
		// int[] score = new int{26,32,54,75,34};
		
		for (int i = 0; i < score.length; i++) {
			System.out.println("score[" + i + "] = " + score[i]);
		}
		System.out.println("============");
		int sum = 0;

		for (int i : score) {
			sum += i;
		}
		System.out.println(sum +" "+ (double)sum / score.length);
	}
}
