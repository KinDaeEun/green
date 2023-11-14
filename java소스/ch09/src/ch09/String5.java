package ch09;

public class String5 {
	public static void main(String[] args) {
		String[] str = { "insert", "update", "delete", "select" };
		for (String s : str) {
			if (s.startsWith("s"))
				System.out.println("s로 시작: " + s);
			if (s.endsWith("e"))
				System.out.println("e로 끝: " + s);
			if (s.contains("l"))
				System.out.println("l이 포함: " + s);
		
		}
	}
}
