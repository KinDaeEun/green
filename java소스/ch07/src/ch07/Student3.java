package ch07;

public class Student3 extends Person3 {
	private String ban;
	Student3(String name, int age, String ban){
		super(name,age);
		this.ban = ban;
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
