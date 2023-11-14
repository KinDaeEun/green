package ch07;

public class Teacher3 extends Person3 {
	private String subject;

	Teacher3(String name, int age, String subject) {
		super(name,age);
		this.subject = subject;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	void print() {
		super.print();
		System.out.println("과목: " + subject);
	}
}
