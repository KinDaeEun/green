package ch04;

public class Arr5 {
	public static void main(String[] args) {
		String[] fruit = { "산딸기", "판딸기", "집딸기", "죽은딸기" };
		for (int i = 0; i < fruit.length; i++) {
			System.out.println(fruit[i]);
		}
		System.out.println("==========");
		for(String i: fruit) {
			System.out.println(i);
		}
		int sum = 0;
		int[] score = {89,97,57,77,82};
		for(int i = 0; i<score.length;i++) {
			sum += score[i];
			System.out.println(sum);
		}
		int sum2 = 0;
		System.out.println("===========");
		for(int i: score) {
			sum2+=i;
			System.out.println(sum2);
		}
	}

}
