package ch03;

public class If11 {
	public static void main(String[] args) {
		int month = Integer.parseInt(args[0]);
		String season = "";
		if (month == 12 || month == 1 || month == 2)
			season = "겨울";
		else if (month == 3 || month == 4 || month == 5)
			season = "봄";
		else if (month == 6 || month == 7 || month == 8)
			season = "여름";
		else if (month == 9 || month == 10 || month == 11)
			season = "가을";

		int etc = month % 3;
		if (etc == 0)
			season = "초" + season;
		else if (etc == 1)
			season = "찐" + season;
		else
			season = "늦" + season;
		

		if (month > 12)
			System.out.println("바보니 없는 월이잖아!!");
		else
			System.out.println("월은" + month + "이고 계절은" + season + "입니다");
	}
}
