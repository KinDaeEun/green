package ch05;

class B1 {
	static int[] i1 = new int[10];
	static int i2;
	static{ // instance 초기화 블럭, 실행문을 작성할 수 있음 (원래 메서드에서만 실행 가능)
//		for (int i = 0; i < i1.length; i++) {
//			i1[i] = (int) (Math.random() * 20) + 1;
//		}
		i2 = 12;
	}

}

public class InstanceInit1 {
	public static void main(String[] args) {
		B1 b1 = new B1();
//		for (int i = 0; i < b1.i1.length; i++) {
//			System.out.println(b1.i1[i]);
//		}
		b1.i2 = 13;
		System.out.println("==================");
		System.out.println(b1.i2);
		B1 b2 = new B1();
		
//		for (int i = 0; i < b2.i1.length; i++) {
//			System.out.println(b2.i1[i]);
//		}
		System.out.println("==================");
		System.out.println(b2.i2);
	}
}
