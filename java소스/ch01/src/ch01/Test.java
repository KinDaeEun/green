package ch01;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		int[] a =  { 34, 44, 27, 77, 88, 99, 66, 57, 26, 17 };
		int[]b = {1,2,3,8,20};
		System.out.println(arrAvg(b));
		

		
	}
	static float arrAvg(int []a) {
		int sum = 0;
		int max = a[0];
		int min = a[0];
		for(int i = 0;i<a.length;i++) {
			if(a[i]>max) {
				max=a[i];
			}
			if(a[i]<min) {
				min=a[i];
			}
			sum += a[i];
		}
		float avg =(float)(sum-max-min)/(a.length-2);
		float result = (float) (Math.round(avg*10)/10.0);

		return result;
	}
}
