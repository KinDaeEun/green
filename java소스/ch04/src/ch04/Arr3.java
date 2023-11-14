package ch04;

public class Arr3 {
	public static void main(String[] args) {
		int[] arr = new int[5];
		for (int i = 0; i < 5; i++) {
			arr[i] = (int) (Math.random() * 20) + 1;
		}

		for (int i = 0; i < arr.length ; i++) {
			System.out.println(arr[i]);
		}
		System.out.println("=========");
		for (int i : arr) {
			System.out.println(i);
		}
	}
	
	
}
