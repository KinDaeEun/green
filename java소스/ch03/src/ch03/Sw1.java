package ch03;

public class Sw1 {
	public static void main(String[] args) {
		int num = Integer.parseInt(args[0]);
		switch (num) {
		case 1:
			System.out.println("1인데요");
			break;
		case 2:
			System.out.println("2인데요");
			break;
		case 3:
			System.out.println("3인데요");
			break;
		case 4:
			System.out.println("4인데요");
			break;
		default:
			System.out.println("1,2,3,4중에서 입력하세요");
		}
	}
}
