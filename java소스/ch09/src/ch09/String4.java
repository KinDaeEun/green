package ch09;

public class String4 {
	public static void main(String[] args) {
		String str = "오늘은 금요일이야 야호!!";
		for (int i = str.length() - 1; i >= 0; i--) {
			System.out.print(str.charAt(i));
		}
	}
}
