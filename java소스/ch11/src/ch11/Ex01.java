package ch11;

import java.util.*;

public class Ex01 {
	public static void main(String[] args) {
		List<Integer> list1 = new ArrayList<>();
		List<Integer> list2 = new ArrayList<>();
		List<Integer> kyo = new ArrayList<>();
		List<Integer> hap = new ArrayList<>();
		List<Integer> cha = new ArrayList<>();
		List<Integer> cha2 = new ArrayList<>();
		list1.add(1);
		list1.add(2);
		list1.add(3);
		list1.add(4);
		
		list2.add(3);
		list2.add(4);
		list2.add(5);
		list2.add(6);
		
		System.out.println("list1: "+list1);
		System.out.println("list2: "+list2);
		//kyo에 list1의 데이터 모두 추가, list1에 list2에 있는 데이터를 남겨라
		kyo.addAll(list1);
		kyo.retainAll(list2);
		System.out.println("교집합: "+kyo);
		
		//removeAll은 hap에 있는 데이터 중에 list2에 있는 데이터를 제거
		hap.addAll(list1);
		hap.removeAll(list2);
		System.out.println(hap);
		hap.addAll(list2);
		System.out.println("합집합: "+hap);
		
		cha.addAll(list1);
		cha.removeAll(list2);//list1-list2
		System.out.println("차집합: "+cha);
		
		cha2.addAll(list2);
		cha2.removeAll(list1);//list2-list1
		System.out.println("차집합: "+cha2);
	}
}
