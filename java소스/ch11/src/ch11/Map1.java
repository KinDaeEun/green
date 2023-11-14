package ch11;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Map1 {
	public static void main(String[] args) {
		HashMap<String, String> hm = new HashMap<>();
		hm.put("로제", "010-1111-1234");
		hm.put("보검", "010-1234-1234");
		hm.put("제니", "010-2222-3333");
		hm.put("은우", "010-3333-2222");
		//key를 넣어서 get method를 실행하면 값을 읽는다
		System.out.println(hm.get("보검"));
		System.out.println("================");
		
		
		Set<String> keys = hm.keySet();
		
		for(String key:keys) {
			System.out.println(key+": "+hm.get(key));
		}
		Iterator<String> its = keys.iterator();
		while(its.hasNext()) {
			System.out.println(its.next()+": "+hm.get(its.next()));
		}
		
			
		
//		Set<String> keys = hm.keySet(); //map에서 key만 set 형식으로 추출
//		for(String key:keys) {
//			System.out.println(key+":"+hm.get(key));
//		}
//		System.out.println("============");
//		Iterator<String> it = hm.keySet().iterator();
//		while(it.hasNext()) {
//			String key = it.next();
//			System.out.println(key+":"+hm.get(key));
//		}
	

	}
}
