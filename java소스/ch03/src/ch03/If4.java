package ch03;

public class If4 {
	public static void main(String[] args) {
		int i1 = 1;
		if (i1 < 0) {
			//                            음수 앞에 - 붙이면 절대값으로 변경가능(-i1)
			System.out.println("0보다 작다" + Math.abs(i1));
		} else {
			System.out.println("0보다 크다.\n x는 양수네");
		}
	}
}
