 package ch09;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regur1 {
	public static void main(String[] args) {
		String[] data = {"bat", "baby", "bonus", "cA","ca", "co", "c.",
				"c0", "car","combat","count", "date", "disc"};
		//                            c로시작[영문자 소문자 중 1개]*여러번
		Pattern p = Pattern.compile("c[a-z]*");
		for(int i = 0;i<data.length;i++) {
			Matcher m = p.matcher(data[i]);
			if(m.matches())
				System.out.println(data[i]+", ");
		}
	}
}
