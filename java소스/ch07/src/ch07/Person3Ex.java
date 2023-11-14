package ch07;

public class Person3Ex {
	public static void main(String[] args) {
		Student3 st1 = new Student3("민지", 23, "1반");
		Student3 st2 = new Student3("하니", 16, "2반");
		Teacher3 th1 = new Teacher3("보검", 29, "자바");
		Teacher3 th2 = new Teacher3("은우", 31, "스프링");
		Manager3 mg1 = new Manager3("명수", 52, "화장실청소");
		Manager3 mg2 = new Manager3("로제", 26, "보컬");
		         
		Person3[] persons= {st1,st2,th1,th2,mg1,mg2};
		for(Person3 p:persons) {
			p.print();
		}
	}
}
