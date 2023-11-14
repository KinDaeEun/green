package ch07;

public class Teacher2 extends Person {
	private String subject;

	Teacher2(String name, int age, String subject) {
		setName(name);
		setAge(age);
		setSubject(subject);
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	void print() {
		super.print();
	}
}
