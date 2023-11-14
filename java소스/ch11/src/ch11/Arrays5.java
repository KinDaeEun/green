package ch11;

import java.util.Arrays;
import java.util.Collections;

public class Arrays5 {
	public static void main(String[] args) {
		Member2 m1 = new Member2("하니", 16);
		Member2 m2 = new Member2("재석", 50);
		Member2 m3 = new Member2("경규", 60);
		Member2 m4 = new Member2("보검", 30);
		Member2 m5 = new Member2("제니", 16);
		Member2[] members = {m1,m2,m3,m4,m5};
		System.out.println(Arrays.toString(members));
		Arrays.sort(members);
		System.out.println(Arrays.toString(members));
		Arrays.sort(members, Collections.reverseOrder());
		System.out.println(Arrays.toString(members));


	}
}
