package ch15;

import java.util.Arrays;

public class Looping1Ex {
	public static void main(String[] args) {
		int[] arr = {1,2,3,7,6};
		//peek는 중간단계이므로 실행 안됨
		Arrays.stream(arr).filter(a -> a%2 == 0).peek(n-> System.out.println(n));
		//sum()는 최종단계이므로 실행
		int sum = Arrays.stream(arr).filter(a -> a%2 == 0).peek(n-> System.out.println(n)).sum();
		System.out.println(sum);
		
		//forEach는 최종단계이므로 실행

		Arrays.stream(arr).filter(a -> a%2 == 0).forEach(n->System.out.println(n));
	}
}
