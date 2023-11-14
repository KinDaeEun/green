package ch04;

public class Arr1 {
	public static void main(String[] args) {
		int kim = 77, choi = 88, kang = 91, lee = 44;
		int sum = kim + choi + kang + lee;
		System.out.println("총점: " + sum);
		int sum2 = 0;
		int[] score = new int[4];
		score = new int[] {1,2,3};
//		score[0] = 77;
//		score[1] = 55;
//		score[2] = 98;
//		score[3] = 86;
//		score[4] = 91;
		for (int i = 0; i<score.length; i++) {
			sum2 += score[i]; 
		}
		
		
		System.out.println("총점: " + sum2); 

	}
}
