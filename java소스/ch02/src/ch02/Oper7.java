package ch02;

public class Oper7 {
	public static void main(String[] args) {
		float pi = 3.141592f;
		float shortPi = (int) (pi * 1000) / 1000f;
		System.out.println("shortPi = " + shortPi);
		
		shortPi = Math.round(pi * 1000) / 1000f;
		System.out.println("shortPi = " + shortPi);

	}
}
