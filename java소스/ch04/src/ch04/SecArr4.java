package ch04;

public class SecArr4 {
	public static void main(String[] args) {
		System.out.println("국어\t영어\t수학\t과학\t총점\t평균");
		int[][] arr = new int[3][4];
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = (int) (Math.random() * 100) + 1;
				System.out.print(arr[i][j] + "\t");
				sum += arr[i][j];
			}
			System.out.println(sum + "\t" + sum / arr[i].length);
			sum = 0;
		}
	}
}