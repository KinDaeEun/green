package ch11;

import java.util.LinkedList;

public class Link1 {
	public static void main(String[] args) {
		LinkedList<String> snakes = new LinkedList<>();
		snakes.add("구렁이");snakes.add("팔렁이");snakes.add("칠렁이");
		snakes.add("구렁이");snakes.add("구렁삼");
		prn(snakes);
		
		
		snakes.add(2,"도마뱀");//인덱스 2번에 도마뱀 추가 
		prn(snakes);
		snakes.set(4, "뱀장어");//인덱스 4번 수정
		prn(snakes);
		snakes.remove(1);//인덱스 1번 삭제
		prn(snakes);
		snakes.remove("구렁이");//구렁이 데이터를 찾아서 첫번째 데이터 한 건 삭제
		prn(snakes);
	}

	private static void prn(LinkedList<String> snakes) {
		for(String snake:snakes) {
			System.out.print(snake+"\t");
		}
		System.out.println();
	}
}
