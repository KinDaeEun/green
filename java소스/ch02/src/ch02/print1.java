package ch02;

public class print1 {

	public static void main(String[] args) {
		System.out.printf("%d\n", 16);	// 16출력
		System.out.printf("%5d\n", 16);	// 5칸확보하고 16출력(숫자는 뒤부터)
		System.out.printf("%-5d\n", 16);// 5칸확보하고 16출력(숫자는 앞부터)
		System.out.printf("%05d\n", 16);// 5칸확보하고 16출력(숫자는 뒤부터, 빈자리는 0으로)
		System.out.printf("%s\n", "허걱");	// 허걱
		System.out.printf("%5s\n", "허걱");	// 5칸확보하고 허걱 뒤부터
		System.out.printf("%-5s\n", "허걱");// "           앞
//		System.out.printf("%05s\n", "허걱");// 문자는 빈자리 0으로 못채움
	}
	
}
