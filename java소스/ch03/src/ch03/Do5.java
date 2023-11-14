package ch03;

public class Do5 {
	public static void main(String[] args) {
		int i = 1;
		int j = 2;
		System.out.printf("구구단\n=======\n");
		do {
			do {
				System.out.printf("%d * %d = %d\t",j,i,j*i);
				j++;
			} while (j <= 9);
			System.out.println();
			j=2;
			i++;
		} while (i <= 9);
	}
}
