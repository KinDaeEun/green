package ch15;

import java.util.*;
import java.util.stream.Stream;

public class String1Ex {
	public static void main(String[] args) {
//		List<String> list = new ArrayList<>();
//		list.add("BTS");
//		list.add("블랙핑크");
//		list.add("뉴진스");
		
		List<String> list= Arrays.asList("BTS","블랙핑크","뉴진스");
		for(String name:list) {
			System.out.println(name);
		}
		System.out.println("============");
		
		Iterator<String> it = list.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		System.out.println("============");
		
		Stream<String> stream = list.stream(); //stream사용
		stream.forEach(name -> System.out.println(name));
		
		
		
	}
}
