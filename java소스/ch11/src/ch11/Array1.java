package ch11;

import java.util.*;

public class Array1 {
	public static void main(String[] args) {
		// 제네릭(Generic) al1에는 문자열 데이터만 보관
		ArrayList<String> al1 = new ArrayList<>();
		al1.add("구렁이");
		al1.add("팔렁이");
		al1.add("칠렁이");
		al1.add("구렁이");
		al1.add("구렁삼");
		
		System.out.println("갯수: " + al1.size());
		for (int i = 0; i < al1.size(); i++) {
			System.out.println(al1.get(i));
		}
		System.out.println("====================");
		for (String s : al1) {
			System.out.println(s);
		}
		System.out.println("====================");
		Iterator<String> its = al1.iterator(); // Iterator 형식에 맞게 변경하여 저장
		while (its.hasNext()) { // 가져올 데이터를 가지고 있니?
			System.out.println(its.next()); // 가져와
		}
		System.out.println(al1);
		int[] a = { 1, 2 };
		System.out.println(Arrays.toString(a));

	}
}
