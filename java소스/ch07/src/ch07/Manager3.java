package ch07;

public class Manager3 extends Person3 {
	private String part;

	Manager3(String name, int age, String part) {
		super(name,age);
//		this.part = part;
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
