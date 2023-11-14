package ch15;

import java.util.*;
import java.util.stream.IntStream;

public class SortingEx1 {
	public static void main(String[] args) {
		IntStream intStream = Arrays.stream(new int[] {5,2,6,3,4,1});
		intStream.sorted().forEach(n->System.out.print(n+","));
		List<Student3> list = Arrays.asList(new Student3("로제",88),new Student3("보검",77),new Student3("제니",92),new Student3("은우",68));
		list.stream().sorted().forEach(s->System.out.println(s.getScore()+","));
		
		list.stream().sorted(Comparator.reverseOrder()).forEach(s->System.out.println(s.getScore()+","));
	}
}
