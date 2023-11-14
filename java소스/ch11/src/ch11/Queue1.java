package ch11;

import java.util.LinkedList;

public class Queue1 {
	public static void main(String[] args) {
		String[] fruits = {"사과","딸기","포도","바나나"};
		LinkedList<String> que = new LinkedList<>();
		for(String fruit: fruits) {
			que.offer(fruit);
		}
		while(! que.isEmpty()) {
			System.out.println(que.poll());//poll은 하나씩 추출하여 사용한 후에 버림
			
		}
	}
}
