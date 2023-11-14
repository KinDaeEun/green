package ch11;

import java.util.*;

public class Gene1 {
	public static void main(String[] args) {
		List list1 = new ArrayList();
		list1.add(1);
		list1.add(2);
		list1.add("대박");
		list1.add(3);
		list1.add(4);
		list1.add("사건");
		System.out.println(list1);
		
		//제네릭 <> 저장할 데이터 형식을 지정
		List<Integer> list2 = new ArrayList<>();
		list2.add(1);
		list2.add(2);
		//list2.add("대박");
		list2.add(3);
		list2.add(4);
		//list2.add("사건");
		System.out.println(list2);
		
	}
}
