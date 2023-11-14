package ch04;

public class SecArr {
	public static void main(String[] args) {
		int[][] arr = new int[2][3];
		arr[0][0] = 12000000;
		arr[0][1] = 33;
		arr[0][2] = 44;
		arr[1][0] = 22;
		arr[1][1] = 11;
		arr[1][2] = 77;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println();
		}
		System.out.println("==================");
		for (int[] ar : arr) {
			for (int a : ar) {
				System.out.print(a + "\t");
			}
			System.out.println();
		}
	}
}
