package ch02;

public class Cast1 {
//	강제 형변환 (데이터형) 값	down casting
	public static void main(String[] args) {
		System.out.println((char)65);
		System.out.println((int)'A');
		System.out.println((int)1.75);	// 정수에는 소숫점 이하가 없으므로 버림
		System.out.println((float)5);	
//		up casting은 묵시적(자동으로) 형변환이 되므로 (데이터형)이 불 필요
		double d1 = 4.76f;
		System.out.println(d1);	
		
		int i1 = 'A';
		System.out.println(i1);
	}
	
}
