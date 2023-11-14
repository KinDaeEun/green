package ch05;

class B2 {
	static int[] i1 = new int[5]; // program loading후 사용
	int[] i2 = new int[5]; // instance 생성후에 사용
	int i3; // instance 생성후에 사용
	static int i4=10; // program loading후 사용
	static{ // instance 생성후에 사용
		
		i4 = 20;
		for (int i = 0; i < i1.length; i++) {
			i1[i] = (int) (Math.random() * 20) + 1;
		}
	
	}
}

public class StaticInit1 {

	public static void main(String[] args) {
		B2 b2 = new B2();
		b2.i3 = 10;
		b2.i4 = 50;

		for (int i = 0; i < b2.i1.length; i++) {
			System.out.println(b2.i1[i]);
		}
		for (int i = 0; i < b2.i2.length; i++) {
			System.out.println(b2.i2[i]);
		}
		System.out.println("=======");
		System.out.println(b2.i3);
		System.out.println(b2.i4);
		System.out.println("====================");

		B2 b3 = new B2();

		for (int i = 0; i < b3.i1.length; i++) {
			System.out.println(b3.i1[i]);
		}
		for (int i = 0; i < b3.i2.length; i++) {
			System.out.println(b3.i2[i]);
		}
		System.out.println("==================");
		System.out.println(b3.i3);
		System.out.println(b3.i4);

	}
}
