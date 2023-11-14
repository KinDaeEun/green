package ch02;

public class Var4 {

	public static void main(String[] args) {
		
		double d1 = 3.14; // 기본(default) default
		float f1 = 7.77f; // 실수 뒤에 f/F를 붙여야 float형을 사용하겠다는 의미
		float f2 = 8.77F;
		
		System.out.println("d1 = " +d1);
		System.out.println("f1 = " +f1);
		System.out.println("f2 = " +f2);
//	정수는 default가 int임, byte/short에 사용해도 범위가 문제 없으면 사용 가능
// 	long형을 사용할 때는 숫자 뒤에 1/L을 붙여서 사용
		byte b1 = 25; // int i = 3.14; 정수를 정의하고 실수를 넣으면 에러
//		byte b2 = 128; 127보다 크기 때문
		System.out.println("b1 = "+ b1);
		long l1 = 100000000000l;	// 2^31 - 1보다 크면 1/L을 붙여야함
		System.out.println("l1 = "+ l1);
		double d2 = 100;
		System.out.println("d2 = " + d2);
	}
	
}
