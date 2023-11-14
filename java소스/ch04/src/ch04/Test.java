package ch04;

import java.util.Arrays;

public class Test {
	public static void main(String[] args) {
		String[] A1 = { "A", "B", "C", "D", "E" }; // A는 B보다 길이가 크거나 같다.
		String[] B1 = { "X", "Y" }; // A는 인덱스 짝수에 B는 인덱스 홀수에 채워서 C작성
//		C = {"A", "X", "B", "Y", "C", "X", "D", "Y", "E", "X"}		
		String[] A2 = { "A", "B", "C", "D" };
		String[] B2 = { "X", "Y", "Z" };
//		C = {"A", "X", "B", "Y", "C", "Z", "D", "X"}
		String[] C1 = arr(A1, B1);
		System.out.println(Arrays.toString(C1));
		String[] C2 = arr(A2, B2);
		System.out.println(Arrays.toString(C2));
	}

	private static String[] arr(String[] a1, String[] b1) {
		String[] c = new String[a1.length * 2];
		int k = 0;
		for (int i = 0; i < a1.length; i++) {
			c[i * 2] = a1[i];
			k = i % b1.length;
			c[i * 2 + 1] = b1[k];
		}
		return c;
	}
}
