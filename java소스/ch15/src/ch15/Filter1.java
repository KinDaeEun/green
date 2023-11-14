package ch15;

import java.util.Arrays;
import java.util.List;
public class Filter1 {
	public static void main(String[] args) {
		List<String> names = Arrays.asList("로제","보검","제니","로제","은우","제길","제니");
		//distinct 중복 제거
		names.stream().distinct().forEach(n->System.out.println(n));
		System.out.println("========");
		
		names.stream().filter(n->n.startsWith("제")).forEach(n-> System.out.println(n));
		System.out.println("========");
		
		names.stream().filter(n->n.startsWith("제")).distinct().forEach(n-> System.out.println(n));

	}
}
