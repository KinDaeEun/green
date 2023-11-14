package ch07;

public class Student2 extends Person {
	private String ban;

	Student2(String name, int age,String ban){
		setName(name);
		setAge(age);
		setBan(ban);
	}

	public String getBan() {
		return ban;
	}

	public void setBan(String ban) {
		this.ban = ban;
	}
	void print() {
		super.print();
		System.out.println("학급: "+ban);
	}
}
