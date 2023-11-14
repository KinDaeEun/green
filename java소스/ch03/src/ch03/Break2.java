package ch03;

public class Break2 {
	public static void main(String[] args) {
		// k:label break babel을 주면 그 label해당하는 반복문 종료
		k: for (int i = 1; i <= 10; i++) {
			 for (int j = 1; j <= 10; j++) {
				System.out.println("대박: " + j);
				if (j > 4)
					break  k;
			}
			System.out.println("== 사건: " + i);
		}
	}
}
