package ch04;

public class DebugTest1 {

	public static void main(String[] args) {
		int[] arr = new int[10];
		int dan = 5; // break point
		for (int i = 0; i < 10; i++) {
			arr[i] = i * dan;
			System.out.println(arr[i]);
		}

	}
}
