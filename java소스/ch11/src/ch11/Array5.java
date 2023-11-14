package ch11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Array5 {
	public static void main(String[] args) {
		String[] fruits = {"산딸기","판딸기","죽은딸기","알카리딸기"};
		ArrayList<String> list = new ArrayList<>();
		
		
		for(String fruit: fruits) {
			list.add(fruit);
		}
		System.out.println(list);
		System.out.println(list.indexOf("판딸기"));
		list.clear();
		System.out.println(list);

		//list형식으로 데이터 추가
		List<String> list2 = Arrays.asList("로제","보검","제니","은우");
		System.out.println(list2);
		
		
	}
}
