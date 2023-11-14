package ch04;

public class Amount1 {
	public static void main(String[] args) {
		System.out.println("매출현황");
		System.out.println("제품명\t월\t월\t월\t월\t합계\t평균");
		String[] name = { "냉장고", "테레비", "청소기" };
		int sum = 0;
		int[][] amt = { { 250, 170, 300, 780 }, { 170, 120, 150, 220 }, { 450, 230, 400, 250 } };
		for (int i = 0; i < amt.length; i++) {
			System.out.print(name[i] + "\t");
			for (int j = 0; j < amt[i].length; j++) {
				sum += amt[i][j];
				System.out.print(amt[i][j] + "\t");
			}
			System.out.println(sum + "\t" + sum / amt[i].length);
			sum = 0;
		}
	}
}
