package ch11;

import java.util.TreeSet;
import java.util.Scanner;
import java.util.Set;

public class Lotto2 {
	public static void main(String[] args) {//TreeSet 자동 정렬
		Set<Integer> lotto = new TreeSet<>();
		Scanner sc = new Scanner(System.in);
		System.out.println("몇개를 조작할까요?");
		int number = sc.nextInt();
		while(lotto.size()<number) {
			System.out.println("원하는 번호 1~45입력하세요");
			int num = sc.nextInt();
			lotto.add(num);
		}
		
		while(lotto.size()<6) {
			int num = (int)(Math.random()*45)+1;
			lotto.add(num);
		}
		System.out.println(lotto);
		sc.close();
	}
}
