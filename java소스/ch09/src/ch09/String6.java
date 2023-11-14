package ch09;

public class String6 {
	public static void main(String[] args) {
		String str = "내일이 토요일이네";
		for (int i = str.length() - 1; i >= 0; i--) {
			System.out.print(str.charAt(i));
		}
		System.out.println("\n길이는: " + str.length());
		System.out.println("=======================");

		String[] color = { "red", "orange", "yellow", "green", "blue", "navy", "violet" };
		int n = 0;
		for (String c : color) {
			n++;
			if (c.startsWith("b"))
				System.out.println("b로 시작하는 색깔은: " + c);
			if (c.endsWith("e"))
				System.out.println("e로 끝나는 색깔은: " + c);
			if (c.contains("l"))
				System.out.println("l를 포함하는 색깔은: " + c);
		}
		System.out.println("배열의 갯수는: " + n);

	}
}
