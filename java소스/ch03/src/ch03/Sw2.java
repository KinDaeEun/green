package ch03;

public class Sw2 {
	public static void main(String[] args) {
		int num = Integer.parseInt(args[0]);
		switch (num) {
		case 1:
			System.out.println("안녕하세요");
			break;
		case 2:
			System.out.println("반갑습니다");
			break;
		case 3:
			System.out.println("처음 뵙겠습니다");
			break;
		default:
			System.out.println("누구세요");
		}
	}
}
