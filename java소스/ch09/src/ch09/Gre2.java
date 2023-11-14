package ch09;

import java.util.GregorianCalendar;

public class Gre2 {
	public static void main(String[] args) {
		GregorianCalendar gc = new GregorianCalendar(2004,1,5,10,34);
		System.out.printf("내 생일은 %d년 %d월 %d일 %d시 %d분이다",
				gc.get(GregorianCalendar.YEAR),
				gc.get(GregorianCalendar.MONTH),
				gc.get(GregorianCalendar.DATE),
				gc.get(GregorianCalendar.HOUR),
				gc.get(GregorianCalendar.MINUTE));		


	}
}
