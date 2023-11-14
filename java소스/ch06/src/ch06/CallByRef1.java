package ch06;

class D1 {
	static void m1(int[] x) { // 주소를 찾아가서 변경하기 때문에 같이 변경
		x[0] = 77;
		x[1] = 88;
		for (int i = 0; i < x.length; i++) {
			System.out.println("m1 x[" + i + "]=" + x[i]);
		}
	}
}

public class CallByRef1 {
	public static void main(String[] args) {
		int[] x = { 12, 21 };
		D1.m1(x); // 참조형 데이터를 전달할 때는 주소를 전달
		for (int i = 0; i < x.length; i++) {
			System.out.println("m1 x[" + i + "]=" + x[i]);
		}
	}
}
