package ch11;

public class Member2 implements Comparable<Member2>{
	
	String name;
	Integer age;
	
	public Member2(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public int compareTo(Member2 o) { //비교 기준
//		return name.compareTo(o.name);
		String age1 = age + ""; // 비교 대상은 문자열
		String age2 = o.age + "";
		return age1.compareTo(age2);
	}
	public String toString() { //객체 출력하는 형식
		return name+"("+age+")";
	}


	
}
