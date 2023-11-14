package ch09;

import java.util.StringTokenizer;

public class StringToken1 {
	public static void main(String[] args) {     //문자열                      //delimiter  
		StringTokenizer st = new StringTokenizer("토기,사슴,고양이,다람쥐,늑대" , ",");
		while(st.hasMoreTokens()) { //읽을 토큰이 있으면
			                      //차례대로 다음 토큰을 가져와라
			System.out.println(st.nextToken() );
		}
	}
}
