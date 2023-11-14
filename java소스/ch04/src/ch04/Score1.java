package ch04;

public class Score1 {
	public static void main(String[] args) {
		System.out.println("성적표");
		System.out.println("이름\t국어\t영어\t수학\t총점\t평균");
		String[] name = { "로제", "하니", "지민", "제니" };
		int sum = 0;
		int[][] score = { { 90, 80, 70 }, { 76, 86, 90 }, { 90, 78, 90 }, { 81, 78, 98 } };
		System.out.println("===========================================");
		for (int i = 0; i < score.length; i++) {
			System.out.print(name[i]+"\t");
			for (int j = 0; j < score[i].length; j++) {

				System.out.print(score[i][j] + "\t");
				sum += score[i][j];
			}
			System.out.println(sum + "\t" + sum / score[i].length);
			sum = 0;
		}
	}
}
