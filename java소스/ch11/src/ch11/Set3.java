package ch11;

import java.util.HashSet;

public class Set3 {
	public static void main(String[] args) {
		String[] snakes = {"구렁이","팔렁이","칠렁이","구렁이","팔렁이","육렁이"};
		HashSet<String> hs1 = new HashSet<>();
		HashSet<String> hs2 = new HashSet<>();
		for(String snake: snakes) {
			if(!hs1.add(snake)) { // snake를 hs1에 입력안되면 hs2에 입력
				hs2.add(snake);
			}
		}
		System.out.println(hs1);
		System.out.println(hs2);
		hs1.removeAll(hs2);
		System.out.println(hs1);
		System.out.println(hs2);
	}
}
