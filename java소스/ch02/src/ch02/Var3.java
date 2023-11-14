package ch02;

public class Var3 {
	
	public static void main(String[] args) {
		
//		int a= 5; int b = 10; int c = 0;
		int a = 5, b = 10, c = 0;
//		int a2 =7, byte b1 = 56; //데이터형이 같을 떄만 ,로 연결 가능
		a = a + 10;
		b = b + 10;
		c = a + b;
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		System.out.println("c = " + c);
//		int k;
//		System.out.println("k = " + k); //변수선안만 하고 값이 없으면 사용 못함
//		byte b1 = 300; byte는 -128 ~ 127사이의 범위를 벋어나면 사용 못함
	}
	
}
