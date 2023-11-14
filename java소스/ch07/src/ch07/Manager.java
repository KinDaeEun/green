package ch07;

public class Manager extends Person {
	private String part;

	Manager(String name, int age, String part) {
		setName(name);
		setAge(age);
//		this.part = part;
		setPart(part);
	}

	public String getPart() {
		return part;
	}

	public void setPart(String part) {
		this.part = part;
	}

	void printMg() {
		print();
		System.out.println("담당: " + part);
	}

}
