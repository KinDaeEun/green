package ch09;

import java.util.GregorianCalendar;

public class Gre1 {
	public static void main(String[] args) {
		GregorianCalendar gc = new GregorianCalendar();
		System.out.printf("오늘은 %d년 %d월 %d일 입니다\n",
				gc.get(GregorianCalendar.YEAR),
				gc.get(GregorianCalendar.MONTH)+1,
				gc.get(GregorianCalendar.DATE));
		System.out.println(gc.get(GregorianCalendar.DAY_OF_YEAR));
		//날자를 만들 때 월은 0부터 시작 함
		GregorianCalendar gc1 = new GregorianCalendar(1990,6,28);
		System.out.printf("그날은 %d년 %d월 %d일 입니다\n",
				gc1.get(GregorianCalendar.YEAR),
				gc1.get(GregorianCalendar.MONTH),
				gc1.get(GregorianCalendar.DATE));

	}
}
