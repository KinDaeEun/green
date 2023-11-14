package ch03;

public class Do2 {
	public static void main(String[] args) {
		int i = 0, sum = 0;
		do {
			sum += i;
			i++;
		} while (i <= 10);
		System.out.println(sum);
	}
}
