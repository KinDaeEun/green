package ch03;

public class Sw6 {
	public static void main(String[] args) {
		int month = Integer.parseInt(args[0]);
		String season = "";
		int etc = month % 3;
		switch (etc) {
		case 0:
			season = "초";
			break;
		case 1:
			season = "찐";
			break;
		case 2:
			season = "늦";
			break;
		}
		switch (month) {
		case 12:
		case 1:
		case 2:
			season += "겨울";
			break;
		case 3:
		case 4:
		case 5:
			season += "봄";
			break;
		case 6:
		case 7:
		case 8:
			season += "여름";
			break;
		case 9:
		case 10:
		case 11:
			season += "가을";
			break;
		default:
			season = "없는 계절";
		}

		System.out.println(month + "월은 계절이" + season + "입니다");
	}
}