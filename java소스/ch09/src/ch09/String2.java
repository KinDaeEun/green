package ch09;

import java.util.Arrays;

public class String2 {
	public static void main(String[] args) {
//		System.out.println(2+0+2+3+"년도");
//		System.out.println("년도"+2+0+2+3);

		String str1 = new String("대박");
		String str2 = "쪽박";
		char[] ch = {'수','요','일'};
		String str3 = new String(ch);
		System.out.println(str1+str2+str3);

		String str4 = "오늘은:수요일:뭐:그냥";
		//split을 ,를 기준으로 배열로 변경,괄호안은 배열 분류 기준
		String[] str5 = str4.split(":");
		System.out.println(Arrays.toString(str5));
		
		for(int i = 0;i<str5.length;i++) {
			System.out.println(str5[i]);
		}
		//index 3부터 끝까지
		String str6 = str4.substring(3);
		System.out.println(str6);
		//index 3부터 7앞까지
		String str7 = str4.substring(3, 7);
		System.out.println(str7);
	}
}
