package ch04;

public class SecArr2 {
	public static void main(String[] args) {
		int[][] arr = new int[3][4];
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = (int) (Math.random() * 100) + 1;
				System.out.printf("%d\t", arr[i][j]);
			}
			System.out.println();
		}
		System.out.println("======================");
		for (int ar[] : arr) {
			for (int a : ar) {
				System.out.printf(a + "\t");
				break ;
			}
			System.out.println();
		}
	}
}
