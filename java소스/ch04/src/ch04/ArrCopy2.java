package ch04;

public class ArrCopy2 {
	public static void main(String[] args) {
		int[] arr1 = { 34, 56, 67, 88 };
		int[] arr2 = new int[10];
		int[] arr3 = new int[10];
		int[] arr4 = new int[10];
		 arr4[0] = 2;
		// 주소가 아니라 실제 데이터 복사
		// 원본 시작 목표 시작 갯수
		System.arraycopy(arr1, 0, arr2, 0, arr1.length);
		System.arraycopy(arr1, 1, arr3, 0, arr1.length - 1);
		System.arraycopy(arr1, 1, arr4, 2, arr1.length - 1);

		arr1[1] = 1234;

		for (int i = 0; i < arr1.length; i++) {
			System.out.print(arr1[i] + "\t");
		}
		System.out.println();
		System.out.println("===================");

		for (int i = 0; i < arr2.length; i++) {
			System.out.print(arr2[i] + "\t");
		}
		System.out.println();
		System.out.println("===================");
		
		for (int i = 0; i < arr3.length; i++) {
			System.out.print(arr3[i] + "\t");
		}
		System.out.println();
		System.out.println("===================");
		for (int i = 0; i < arr4.length; i++) {
			System.out.print(arr4[i] + "\t");
		}
	}
}
