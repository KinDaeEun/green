package ch03;

public class While4 {
	public static void main(String[] args) {
		int i = 11;
		int sum = 0;
		while (i < 21) {
			sum += i;
			System.out.println(i);
			i++;
		}
		System.out.println("합은" + sum);
	}
}
