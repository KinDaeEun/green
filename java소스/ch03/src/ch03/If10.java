package ch03;

public class If10 {
	public static void main(String[] args) {
		int month = 1;
		if (month == 12 || month == 1 || month == 2)
			System.out.println("월은" + month + "이고 겨울입니다");
		else if (month == 3 || month == 4 || month == 5)
			System.out.println("월은" + month + "이고 봄입니다");
		else if (month == 6 || month == 7 || month == 8)
			System.out.println("월은" + month + "이고 여름입니다");
		else if (month == 9 || month == 10 || month == 11)
			System.out.println("월은" + month + "이고 가을입니다");
		else
			System.out.println("바보니 없는 월이잖아!!");
	}
}
