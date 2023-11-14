package ch09;

public class StringBuffer1 {
	//String은 문자열 일부를 변경하지 못하지만 StringBuffer는 가능
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("대박사건");
		System.out.println(sb.reverse());
		StringBuffer sb2 = new StringBuffer("금요일이네요");
		System.out.println(sb2.replace(2,3,"덩이ㅁㅁㅁㅁ"));
		System.out.println("문자열 길이: "+sb.length());
		sb.append("뭥미");
		sb.append("무시기");
		System.out.println(sb);
		
		String a = "aa";
		StringBuffer s = new StringBuffer(a);
		System.out.println(s);
		System.out.println(s.getClass().getName());
	}
}
