package ch09;

public class StringConvert2 {
	public static void main(String[] args) {
		String str = "대박.txt";
		int i = str.indexOf(".");
		System.out.println(str.substring(0, i));
		System.out.println(str.substring(i + 1));

		String s1 = 72 + "";
		String s2 = String.valueOf(27);
		System.out.println(s1 + s2);
	}
}
