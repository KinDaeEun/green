package ch02;

public class Mono2 {
	public static void main(String[] args) {
		int i1 = 5, i2 = 7;
		int k1 = 5 * ++i1 + (2 + i2--) * 3;
		System.out.println("i1=" + i1);// 6
		System.out.println("i2=" + i2);// 6
		System.out.println("k1=" + k1);// 57
	}
}
