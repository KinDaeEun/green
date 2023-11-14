package ch11;

import java.util.Vector;
import java.util.Iterator;

public class Vector2 {
	public static void main(String[] args) {
		Vector<String> fruits = new Vector<>();
		fruits.add("사과");fruits.add("딸기");fruits.add("포도");
		fruits.add("사과");fruits.add("바나나");
		prn(fruits);
		
		fruits.add(1,"수박");prn(fruits);
		fruits.set(3, "키위");prn(fruits);
		fruits.remove(2);prn(fruits);
		fruits.remove("사과");prn(fruits);
		
	}

	private static void prn(Vector<String> fruits) {
		Iterator<String> its = fruits.iterator();
		while(its.hasNext()){
			System.out.print(its.next()+"\t");
		}
		System.out.println();
	}
}
