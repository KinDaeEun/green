package ch02;

public class Mono3 {
	public static void main(String[] args) {
		int i1 = 5, i2 = 10, i3 = 7;
		int k1 = 2 * ++i1 + 3 * i2-- + (2 + 3 * --i3);
		System.out.println("i1 = "+i1);
		System.out.println("i2 = "+i2);
		System.out.println("i3 = "+i3);
		System.out.println("k1 = "+k1);
		
	}
}
