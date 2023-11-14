package ch02;

public class Logical2 {
	public static void main(String[] args) {
		boolean b1 = 2 > 1, b2 = 3 > 2;
		boolean b3 = 1 > 2, b4 = 2 > 3;
		System.out.println("b1 && b2 = " + (b1 && b2));
		System.out.println("b1 && b3 = " + (b1 && b3));
		System.out.println("b3 && b2 = " + (b3 && b2));
		System.out.println("b3 && b4 = " + (b3 && b4));
                               
		System.out.println("b1 || b2 = " + (b1 || b2));
		System.out.println("b1 || b3 = " + (b1 || b3));
		System.out.println("b3 || b2 = " + (b3 || b2));
		System.out.println("b3 || b4 = " + (b3 || b4));
		                       
		System.out.println("!b1 = " + !b1);
		System.out.println("!b3 = " + !b3);
	}
}
