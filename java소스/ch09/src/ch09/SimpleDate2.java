package ch09;

import java.text.SimpleDateFormat;
import java.util.*;

public class SimpleDate2 {
	public static void main(String[] args) {
		GregorianCalendar gc = new GregorianCalendar(2004,0,5,11,1,01);
		SimpleDateFormat sdf1 = new SimpleDateFormat("yy-MM-dd hh:mm:ss");
		SimpleDateFormat sdf2 = new SimpleDateFormat("(E)yyyy/MM/dd (a)hh:mm:ss");
		
		Date date = gc.getTime();
		Date date1 = new Date();
		
		System.out.println(gc.getTime());
		System.out.println(date1.toString());
		
		System.out.println(sdf1.format(date));
		System.out.println(sdf2.format(date));
	}
}
