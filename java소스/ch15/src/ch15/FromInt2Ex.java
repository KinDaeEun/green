package ch15;

import java.util.stream.IntStream;

public class FromInt2Ex {
	static int sum = 0;
	public static void main(String[] args) {
		//1부터 100앞까지
		IntStream stream1 = IntStream.range(1, 100);
		//1부터 100까지
		IntStream stream2 = IntStream.rangeClosed(1, 100);
		stream2.forEach(x -> sum+=x);
		System.out.println("100짜기 합: "+sum);
	}
}
