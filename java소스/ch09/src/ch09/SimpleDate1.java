package ch09;

import java.text.SimpleDateFormat;
import java.util.*;

public class SimpleDate1 {
	public static void main(String[] args) {
		GregorianCalendar gc = new GregorianCalendar();
		SimpleDateFormat sdf1 = new SimpleDateFormat("yy/MM/dd HH:mm:ss");
		SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy/MM//dd HH:mm:ss");
		SimpleDateFormat sdf3 = new SimpleDateFormat("(E)yyyy/MM//dd");
		SimpleDateFormat sdf4 = new SimpleDateFormat("yyyy/MM//dd (a)hh:mm:ss");
		Date date = gc.getTime();
		System.out.println(sdf1.format(date));
		System.out.println(sdf2.format(date));
		System.out.println(sdf3.format(date));
		System.out.println(sdf4.format(date));
		

	}
}
