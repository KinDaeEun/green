package ch02;

public class Logical1 {
	public static void main(String[] args) {
		boolean b1 = 5 > 3, b2 = 5 < 3;
		boolean b3 = 5 == 3, b4 = 5 != 3;
		System.out.println("b1 = " + b1);
		System.out.println("b2 = " + b2);
		System.out.println("b3 = " + b3);
		System.out.println("b4 = " + b4);
		
		System.out.println("t && t =" + (b1 && b4));
		System.out.println("t && f =" + (b1 && b2));
		System.out.println("f && t =" + (b3 && b4));
		System.out.println("f && f =" + (b2 && b3));
		
		System.out.println("t || t =" + (b1 || b4));
		System.out.println("t || f =" + (b1 || b2));
		System.out.println("f || t =" + (b3 || b4));
		System.out.println("f || f =" + (b2 || b3));
		
		
	}
}
