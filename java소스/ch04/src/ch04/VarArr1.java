package ch04;

public class VarArr1 {
	public static void main(String[] args) {
		int[][] arr = new int[3][];
		arr[0]=new int[2];
		arr[0][0] = 76;
		arr[0][1] = 45;
		arr[1] = new int[] { 56, 77, 88 };
		arr[2] = new int[] { 77, 88, 55, 99 };
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + "\t");
				sum += arr[i][j];
			}
			System.out.println("합게: " + sum);
			sum = 0;
		}

	}
}
