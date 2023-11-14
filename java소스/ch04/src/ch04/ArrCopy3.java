package ch04;

public class ArrCopy3 {
	public static void main(String[] args) {
		int[] arr1 = { 34, 56, 67, 88 };
		int[] arr2 = new int[10];
		System.arraycopy(arr1, 2, arr2, 0, arr1.length - 2);
		for (int i = 0; i < arr1.length; i++) {
			System.out.print(arr1[i] + "\t");
		}
		System.out.println();
		for (int ar : arr2) {
			System.out.print(ar + "\t");
		}
	}
}
