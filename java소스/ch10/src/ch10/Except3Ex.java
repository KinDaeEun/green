package ch10;

public class Except3Ex {
	public static void main(String[] args) {
		int[] x = { 12, 45, 25, 0, 6 };
		for (int i = 0; i <= x.length; i++) {
			try {
				System.out.printf("100/%d = %d\n", x[i], 100 / x[i]);
			} catch (ArithmeticException e) {
				System.out.println("0으로 못나눠");
			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("인덱스 범위가 넘었습니다");
			}finally { // 예외 여부에 관계없이 무조건 실행
				System.out.println("난 무조건 하는 문장이야");
			}

		}
	}
}
