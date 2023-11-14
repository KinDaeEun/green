package ch09;

import java.util.*;

public class Gre3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		GregorianCalendar gc = new GregorianCalendar();
		do {
			System.out.println("년도 4자리 입력하세요");
			int year = sc.nextInt();
			if(year == 0)
				break;
			if(gc.isLeapYear(year))
				System.out.println(year+"년은 윤년입니다");
			else
				System.out.println(year+"년은 평년입니다");

		}while(true);
		System.out.println("프로그램 종료");
		sc.close();
	}
}
