package ch07;

public class Manager2 extends Person {
	private String part;

	Manager2(String name, int age, String part) {
		setName(name);
		setAge(age);
		setPart(part);
	}

	public String getPart() {
		return part;
	}

	public void setPart(String part) {
		this.part = part;
	}

	void print() {
		super.print();
		System.out.println("담당: " + part);
	}
}
