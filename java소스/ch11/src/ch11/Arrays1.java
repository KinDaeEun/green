package ch11;

import java.util.Arrays;

public class Arrays1 {
	public static void main(String[] args) {
//		                  0   1   2   3
		String[] arr1 = { "J", "A", "V", "A" };
		String[] arr2 = Arrays.copyOf(arr1, arr1.length);
//		                                  원본   시작 끝
		String[] arr3 = Arrays.copyOfRange(arr1, 1, 3);
		String[] arr4 = new String[arr1.length];
//		                 원본 index 목표 index  갯수
		System.arraycopy(arr1, 0, arr4, 0, arr1.length-1);

//		배열 데이터를 그냥 출력 패키지명.클래스명@해시코드
		System.out.println(Arrays.toString(arr1));
		System.out.println(Arrays.toString(arr2));
		System.out.println(Arrays.toString(arr3));
		System.out.println(Arrays.toString(arr4));
	}
}
