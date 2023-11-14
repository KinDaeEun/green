package ch05;

public class StudentEx {
	public static void main(String[] args) {
		Student st1 = new Student();
		st1.name = "로제";
		st1.age = 26;
		st1.hobby = "침뱉기";
		Student st2 = new Student();
		st2.name = "보검";
		st2.age = 29;
		st2.hobby = "코풀기";
		Student st3 = new Student();
		st3.name = "하니";
		st3.age = 17;
		st3.hobby = "춤추기";
		
		st1.disp();
		st2.disp();
		st3.disp();
	}
}
