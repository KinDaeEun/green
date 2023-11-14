package ch09;

public class StringConvert1 {
	public static void main(String[] args) {
		String str1 = 4 + "";
		String str2 = String.valueOf(5);
		System.out.println(str1 + str2);
		System.out.println(str2.getClass().getName());

		int i1 = Integer.parseInt(str1);
		Integer i2 = Integer.valueOf(str2);
		System.out.println(i1 + i2);
		System.out.println(i2.getClass().getName());

		String str3 = "123";
		int i3 = str3.charAt(0);
		System.out.printf("문자 - %c : 아스키값 - %d\n", i3, i3);
		System.out.println(i3);

		String str4 = "Hello.java";
		int i4 = str4.indexOf(".");
		System.out.println("i4= " + i4);
		System.out.println(str4.substring(i4 + 1));

	}
}
