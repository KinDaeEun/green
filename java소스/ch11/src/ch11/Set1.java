package ch11;

import java.util.HashSet;
import java.util.Iterator;

public class Set1 {
	public static void main(String[] args) {
		HashSet<String> fruits = new HashSet<>();
		fruits.add("사과");
		fruits.add("포도");
		fruits.add("키위");
		fruits.add("사과");
		fruits.add("바나나");
		System.out.println("갯수: "+ fruits.size());
		Iterator<String> it = fruits.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		System.out.println("===============");
		for(String fruit: fruits) {
			System.out.println(fruit);
		}
		System.out.println(fruits);
	}
}
