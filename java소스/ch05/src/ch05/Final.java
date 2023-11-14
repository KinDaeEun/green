package ch05;

public class Final {
	public static void main(String[] args) {
		final float PI = 3.14f; // final 붙인 변수명의 대문자
//		PI = 3.141592f; //final 변경금지
		int r = 10;
		r = 20;
		System.out.println("반지름이 " + r + "인 원의 면적: " + PI * r * r);
	}
}
