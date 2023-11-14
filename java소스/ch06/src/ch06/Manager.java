package ch06;

public class Manager {
	private String name;
	private int age;
	private String part;

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getSubject() {
		return part;
	}
	public void setSubject(String subject) {
		this.part = subject;
	}
	public void printAll() {
		System.out.println("==================");
		System.out.println("이름: "+name);
		System.out.println("나이: "+age);
		System.out.println("과목: "+part);
	}
}