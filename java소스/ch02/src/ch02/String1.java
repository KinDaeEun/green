package ch02;

public class String1 {
	public static void main(String[] args) {
		String name = "아이브";	//String name = '로제': 작운 따옴표 에러
		String addr = " 장원영";  //기본형처럼 사용
		String hobby = new String("노래"); //참조형
		System.out.println(name + addr); // 문자열 + 문자열 => 문자열
		System.out.println("취미: "+hobby);


	}
}
