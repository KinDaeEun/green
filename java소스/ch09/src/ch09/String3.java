package ch09;

import java.util.Arrays;

public class String3 {
	public static void main(String[] args) {
		String str = "우리는 친구였어 아 여름이 왔나";
		String[] str1 = str.split(" ");
		System.out.println(Arrays.toString(str1));
		System.out.println(str.substring(4));
		System.out.println(str.substring(5,13));
		
		String str2 = String.join(" : ", str1);
		System.out.println(str2);
	}
}
