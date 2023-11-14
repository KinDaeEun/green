package ch11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Arrays4 {
	public static void main(String[] args) {
		

		//binarySearch 데이터 찾기를 할 때는 반드시 sort를 하고 실행
		int[] score = {99,97,98};
		Arrays.sort(score);
		System.out.println(Arrays.toString(score));
		int index = Arrays.binarySearch(score, 99);
		System.out.println("찾은 인덱스: "+index);
		
		ArrayList<Integer> score2 = new ArrayList<>();
		for(int s: score) {
			score2.add(s);
		}
		System.out.println("찾은 인덱스: "+score2.indexOf(99));
		
		
		
		String[] names = {"로제","보검","제니","은우"};
		Arrays.sort(names);
		System.out.println(Arrays.toString(names));
		index = Arrays.binarySearch(names, "보검");
		System.out.println("찾은 인덱스: "+index);
		
		System.out.println("===================");
		
		
		//객체를 생성하고 정열
		Member1 m1 = new Member1("하니");
		Member1 m2 = new Member1("제니");
		Member1 m3 = new Member1("은우");
		
		Member1[] members = {m1,m2,m3};
		Arrays.sort(members);
		System.out.println(Arrays.toString(members));
		index = Arrays.binarySearch(members, m2);
		System.out.println("찾은 인덱스: "+index);

		
	}
}
