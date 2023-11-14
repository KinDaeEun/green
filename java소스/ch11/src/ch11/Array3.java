package ch11;

import java.util.ArrayList;

public class Array3 {
	public static void main(String[] args) {
		ArrayList<String> snakes = new ArrayList<>();
		snakes.add("구렁이");snakes.add("팔렁이");snakes.add("칠렁이");
		snakes.add("구렁이");snakes.add("구렁삼");
		prn(snakes);
		System.out.println(snakes.isEmpty());
		
		snakes.add(2,"도마뱀");//인덱스 2번에 도마뱀 추가 
		prn(snakes);
		snakes.set(3, "뱀장어");//인덱스 4번 수정
		prn(snakes);
		snakes.remove(1);//인덱스 1번 삭제
		prn(snakes);
		snakes.remove("구렁이");//구렁이 데이터를 찾아서 첫번째 데이터 한 건 삭제
		prn(snakes);
	}

	private static void prn(ArrayList<String> snakes) {
		for(String snake:snakes) {
			System.out.print(snake+"\t");
		}
		System.out.println();
	}
}
