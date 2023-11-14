package ch07;

public class Person2Ex {
	public static void main(String[] args) {
		Student2 st1 = new Student2("민지", 23, "1반");
		Student2 st2 = new Student2("하니", 16, "2반");
		Teacher2 th1 = new Teacher2("보검", 29, "자바");
		Teacher2 th2 = new Teacher2("은우", 31, "스프링");
		Manager2 mg1 = new Manager2("명수", 52, "화장실청소");
		Manager2 mg2 = new Manager2("로제", 26, "보컬");
		         
		Person[] persons= {st1,st2,th1,th2,mg1,mg2};
		for(Person p:persons) {
			p.print();
		}
	}
}
