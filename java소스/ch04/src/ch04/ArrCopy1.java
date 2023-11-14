package ch04;

public class ArrCopy1 {
	public static void main(String[] args) {
		int[] arr1 = { 34, 56, 67, 88 };
		int[] arr2 = arr1;//주소를 복사
		arr1[1] = 1234;
		for (int i = 0; i < arr1.length; i++) {
			System.out.print(arr1[i] + "\t");
		}
		System.out.println();
		System.out.println("===================");
		for (int i = 0; i < arr1.length; i++) {
			System.out.print(arr2[i] + "\t");
		}


		
	}
}
