package ch04;

public class SecArr5 {
	public static void main(String[] args) {
		int score[][] = {{78,99,67},{88,92,78},{92,56,86}};
		int sum = 0;
		System.out.print("국어\t영어\t수학\t총점\t평균\n");
		for(int ar[]:score) {
			for(int a:ar) {
				sum+=a;
				System.out.print(a+"\t");
			}
			System.out.println(sum+"\t"+sum/ar.length);
			sum = 0;
		}

	}
}
