package ch07;

public class Teacher extends Person {
	private String subject;

	Teacher(String name, int age, String subject) {
		setName(name);
		setAge(age);
		this.subject = subject;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	void printTh() {
		print();
		System.out.println("과목: " + subject);
	}
}
