package ch07;

public class PersonEx {
	public static void main(String[] args) {
		Student st1 = new Student("민지", 23, "1반");
		Student st2 = new Student("하니", 16, "2반");
		Teacher th1 = new Teacher("보검", 29, "자바");
		Teacher th2 = new Teacher("은우", 31, "스프링");
		Manager mg1 = new Manager("명수", 52, "화장실청소");
		Manager mg2 = new Manager("로제", 26, "보컬");
		
		st1.printSt();
		st2.printSt();
		th1.printTh();
		th2.printTh();
		mg1.printMg();
		mg2.printMg();
                 
	}
}
