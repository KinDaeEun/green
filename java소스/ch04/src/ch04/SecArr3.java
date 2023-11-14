package ch04;

public class SecArr3 {
	public static void main(String[] args) {
		//                  00    01      10    11   12
		double[][] arr = {{188.8,166.6},{179.8,158.6,12}};
		for(int i = 0; i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.print(arr[i][j]+"\t");
			}
			System.out.println();
		}
		System.out.println("========================");
		for(double[] ar:arr) {
			for(double a: ar) {
				System.out.print(a+"\t");
			}
			System.out.println();
		}
	}
}
