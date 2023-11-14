package ch11;

import java.util.HashSet;
import java.util.Iterator;

public class Set2 {
	public static void main(String[] args) {
		HashSet<String> s = new HashSet<>();
		s.add("구렁이");
		s.add("팔렁이");
		s.add("칠렁이");
		s.add("구렁이");
		s.add("구렁삼");
		Iterator<String> it = s.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}
}
