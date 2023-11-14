package ch02;

public class Cast4 {
	public static void main(String[] args) {
//		범위가 맞지 않는 데이터를 강제 형변환하면 에러는 없지만 값이 쓰레기가 된다
		byte b1 =(byte)127; // -128 ~ 127
		System.out.println("b1 = "+b1);
		byte b2 = (byte)256;
		System.out.println("b2 = "+b2);	
		// ~ 티타
	}
}
