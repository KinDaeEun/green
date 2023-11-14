package ch04;

public class Ex07 {
	public static void main(String[] args) {
		int[][] score = { { 67, 78, 98 }, { 78, 98, 65 }, { 78, 56, 90 } };
		int sum = 0, max = 0, min = 100, tsum = 0, tmax = 0, tmin = 100;
		System.out.println("국어\t영어\t수학\t합계\t최대\t최소");
		for (int i = 0; i < score.length; i++) {
			for (int j = 0; j < score[i].length; j++) {
				System.out.print(score[i][j] + "\t");
				sum += score[i][j];
				tsum += score[i][j];

				if (max < score[i][j])
					max = score[i][j];

				if (min > score[i][j])
					min = score[i][j];
				
				if (tmax < score[i][j])
					tmax = score[i][j];

				if (tmin > score[i][j])
					tmin = score[i][j];
				
			}
			System.out.print(sum + "\t" + max + "\t" + min + "\t");
			sum = 0;
			max = 0;
			min = 100;
			System.out.println();
		}
		System.out.println("총계 : "+tsum+"\t전체최대 : "+tmax+
				"\t전체 최소 : "+tmin);
		
		
		System.out.println("======================================================");
		
		
		for (int[] ar : score) {
			for (int a : ar) {
				System.out.print(a + "\t");
				sum += a;
				tsum +=a;
				
				if (a > max)
					max = a;
				if (a < min)
					min = a;
				if (a > tmax)
					tmax = a;
				if (a < tmin)
					tmin = a;
			}
			
			System.out.print(sum + "\t" + max + "\t" + min+"\t");
			sum = 0;
			max = 0;
			min = 100;
			System.out.println();
			
		}
		System.out.println("총계 : " + tsum + "\t전체최대 : " + tmax + "\t전체 최소 : " + tmin);

	}
}
