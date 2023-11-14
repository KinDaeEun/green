package ch03;

public class While6 {
	public static void main(String[] args) {
		System.out.println("구구단");
		System.out.println("=======");
		int i = 1, j = 2;
//		while(i<=9) {
//			while(j<=9) {
//				System.out.print(j+"*"+i+"="+i*j+"\t");
//				j++;
//			}
//			i++;
//			j=2;
//			System.out.println();
//		}
		while(i<=9) {
			while(j<=9) {
				System.out.print(j+"*"+i+"="+i*j+"\t");
				j++;
			}
			System.out.println();
			j=2;
			i++;
		}
	}
}
