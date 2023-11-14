package ch04;

import java.util.ArrayList;
import java.util.List;

public class Ex03 {
	public static void main(String[] args) {
		int[] arr = { 10, 20, 30, 40, 50 };
		int sum = 0;
		for (int a : arr) {
			sum += a;
		}
		System.out.println(sum);

		List<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(2);
		for (int l : list) {
			System.out.println(l);
		}
	}

}
