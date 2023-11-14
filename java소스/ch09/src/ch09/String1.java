package ch09;

public class String1 {
	public static void main(String[] args) {
		String str1 = "java";
		String str2 = "java";
		String str3 = new String("java");
		if (str1 == str2)
			System.out.println("1과 2는 같다");
		else
			System.out.println("1과 2는 다르다");
		if (str1 == str3)
			System.out.println("1과 3는 같다");
		else
			System.out.println("1과 3는 다르다");
		
		if (str1.equals(str2))
			System.out.println("1과 2는 같다");
		else
			System.out.println("1과 2는 다르다");
		if (str1.equals(str3))
			System.out.println("1과 3는 같다");
		else
			System.out.println("1과 3는 다르다");
	}
}
