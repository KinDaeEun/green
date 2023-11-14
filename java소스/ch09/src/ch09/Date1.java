package ch09;

import java.util.Date;

public class Date1 {
	public static void main(String[] args) {
		Date date = new Date();
//		사용은 되지만 언젠가는 없어질지도 몰라. 권장하지 않아
		System.out.println(date.getDate());
		System.out.println(date.toString());
	}
}
