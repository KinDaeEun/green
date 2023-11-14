package ch11;

import java.util.*;

public class Map2 {
	public static void main(String[] args) {
		Map<String, String> fruits = new HashMap<>();
		fruits.put("딸기", "달곰하다");
		fruits.put("수박", "시원하다");
		fruits.put("키위", "시큼하다");
		
		Iterator<String> it = fruits.keySet().iterator();
		while(it.hasNext()) {
			String key = it.next();
			System.out.println(key+" : "+fruits.get(key));
		}
		
		Set<String> keys= fruits.keySet();
		for(String key :keys) {
			System.out.println(key+" : "+fruits.get(key));
		}
	}
}
