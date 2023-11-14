package ch11;

import java.util.HashSet;
import java.util.Set;

public class Lotto1 {
	public static void main(String[] args) {//중복된 값을 검사할 필요 없다
		Set<Integer> lotto = new HashSet<>();
		while(lotto.size()<6) {
			int num = (int)(Math.random()*45)+1;
			lotto.add(num);
		}
		System.out.println(lotto);
	}
}
