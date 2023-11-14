package ch03;

public class Continue2 {
	public static void main(String[] args) {
		 for (int i = 0; i < 10; i++) {
			 outer:	for (int j = 0; j < 10; j++) {
				System.out.println("j " + j);
				if (j > 3) {
					System.out.println("");
					continue outer;
				}
				System.out.println("i " + i);
			}
		}
	}
}
