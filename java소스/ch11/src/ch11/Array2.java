package ch11;

import java.util.*;

public class Array2 {
	public static void main(String[] args) {
		ArrayList<String> fruit = new ArrayList<>();
		fruit.add("사과");
		fruit.add("딸기");
		fruit.add("포도");
		fruit.add("사과");
		fruit.add("바나나");
		
		for(int i = 0;i<fruit.size();i++) {
			System.out.println(fruit.get(i));
		}
		System.out.println("============");
		for(String f:fruit) {
			System.out.println(f);
		}
		System.out.println("=============");
		Iterator<String> its = fruit.iterator();
		while(its.hasNext()) {
			System.out.println(its.next());
		}
	}
}
