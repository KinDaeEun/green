package ch15;

import java.util.Arrays;

public class MatchEx {
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,6,7,8,9};
		boolean result = Arrays.stream(arr).allMatch(a->a%2 == 0);
		System.out.println("모두 짝수?: "+ result );
		
		result = Arrays.stream(arr).anyMatch(a->a%2 == 0);
		System.out.println("짝수가 있나?: "+ result );
		
		result = Arrays.stream(arr).noneMatch(a->a%2 == 0);
		System.out.println("짝수가 없나?: "+ result );
	}
}
