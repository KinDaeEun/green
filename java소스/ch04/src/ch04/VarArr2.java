package ch04;

public class VarArr2 {
	public static void main(String[] args) {
		int[][] arr = {{45,78,89},{99,55},{35,98,87,67}};
		int sum = 0;
		for(int[]ar:arr) {
			for(int a: ar) {
				System.out.print(a+"\t");
				sum+=a;
			}
			System.out.println("합계: "+ sum);
			sum = 0;
		}
	}
}
