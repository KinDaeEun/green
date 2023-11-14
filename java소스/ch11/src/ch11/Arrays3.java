package ch11;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
public class Arrays3 {
	public static void main(String[] args) {
		Integer[] score = {45,37,26,77,88,67};
		String[] fruits = {"딸기","포도","복송아","대추","사과"};
		Arrays.sort(score);
		
		System.out.println(Arrays.toString(score));
		Arrays.sort(score,Collections.reverseOrder());
		System.out.println(Arrays.toString(score));
		
		Arrays.sort(fruits);
		System.out.println(Arrays.toString(fruits));
		Arrays.sort(fruits,Collections.reverseOrder());
		System.out.println(Arrays.toString(fruits));
		

	}
}
