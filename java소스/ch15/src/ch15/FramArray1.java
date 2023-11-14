package ch15;

import java.util.*;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class FramArray1 {
	public static void main(String[] args) {
		String[] list = {"보검","제니","로제","은우"};
		Stream<String> stream = Arrays.stream(list);
		stream.forEach(s -> System.out.println(s+", "));
		System.out.println("==========");
		
		int[] arr = {76,45,13,77,25};
		IntStream stream2 = Arrays.stream(arr);
		stream2.forEach(n -> System.out.println(n+", "));
		System.out.println("==========");
		
		List<Student1> list2 = Arrays.asList(new Student1("로제", 26),
				new Student1("보검", 29),new Student1("제니", 25));
		
		Stream<Student1> stream3 = list2.stream();
		stream3.forEach(s -> System.out.println(s.getName()));
	}
}
