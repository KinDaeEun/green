package ch09;

import java.util.Calendar;

public class Cal1 {
	public static void main(String[] args) {
		Calendar cal1  = Calendar.getInstance();
		
		System.out.println("년: "+cal1.get(Calendar.YEAR));
		//java에서 월은 0~11
		System.out.println("월: "+(cal1.get(Calendar.MONTH)+1));
		System.out.println("일: "+cal1.get(Calendar.DATE));
		System.out.println("일: "+cal1.get(Calendar.DAY_OF_MONTH));
		System.out.println("일: "+cal1.get(Calendar.DAY_OF_YEAR));
		System.out.println("시: "+cal1.get(Calendar.HOUR));
		System.out.printf("오늘은 %d년 %d월 %d일입니다",
				cal1.get(Calendar.YEAR),(cal1.get(Calendar.MONTH)+1),cal1.get(Calendar.DATE));
	}
}
