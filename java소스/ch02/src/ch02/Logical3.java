package ch02;

public class Logical3 {
	public static void main(String[] args) {
		int i1 = 7, i2 = 5;
		boolean b1 = i1 > i2, b2 = i1 < i2;
		System.out.println("b1 = " + b1 + ", b2 = " + b2);
		// and의 우선급은 or부다 높음
		boolean b3 = b1 || b1 && b2;
		boolean b4 = (b1 || b2) && b2;
		System.out.println("b3 = " + b3 + ", b4 = " + b4);
	}
}
