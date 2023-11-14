package ch03;

public class Ex01 {
	public static void main(String[] args) {
		int sum = 0;
		for (int i = 1; i <= 20; i++) {

			if (i % 2 == 0 || i % 3 == 0)
				continue;
			sum += i;
			System.out.println(i);

		}
		System.out.println("sun="+sum);
		System.out.println(5%6);
		System.out.println(5/6);
	}
	
}
