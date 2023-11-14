package ch11;

public class Member1 implements Comparable<Member1>{

	String name;
	public Member1(String name) {
		this.name = name;
	}
	
	@Override
	public int compareTo(Member1 o) {
		return name.compareToIgnoreCase(o.name);//대소문자 무시
		
	}

	public String toString() {//객체 출력하는 형식
		return name;
	}
	
}
