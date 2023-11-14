package ch09;

import java.util.Calendar;


public class Cal2 {
	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		System.out.printf("지금은 %d년 %d월 %d일 %d시 %d분 %d초입니다\n", cal.get(Calendar.YEAR), (cal.get(Calendar.MONTH)+1),
				cal.get(Calendar.DATE), cal.get(Calendar.HOUR_OF_DAY), cal.get(Calendar.MINUTE), cal.get(Calendar.SECOND));
		System.out.println("오늘은 이번주 : " + cal.get(Calendar.DAY_OF_WEEK) + "요일입니다.");
		System.out.println("오늘은 올해의 : " + cal.get(Calendar.WEEK_OF_YEAR) + "주입니다.");

	}
}
