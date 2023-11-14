package ch11;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class Arrays2 {
	public static void main(String[] args) {
		Integer[] score = { 76, 45, 34, 89, 100, 50, 90, 92 };
		System.out.println(Arrays.toString(score));
		Arrays.sort(score);// 오름차순 정열
		System.out.println(Arrays.toString(score));
		
		Arrays.sort(score,Collections.reverseOrder());
		System.out.println(Arrays.toString(score));
		
		
		String[] name = {"하니","로제","보검","제니","은우"};
		System.out.println(Arrays.toString(name));
		Arrays.sort(name);// 오름차순 정열
		System.out.println(Arrays.toString(name));
		
		Arrays.sort(name,Collections.reverseOrder());
		System.out.println(Arrays.toString(name));
		

		
	}

}
