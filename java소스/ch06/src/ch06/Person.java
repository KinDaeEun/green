package ch06;

public class Person {
	//자바에서는 멤버변수는 private으로하고 메서드를 public하여 메서드를 통하여 변수를 변경
	private String name;
	private int age;

	public String getName() { // 읽을 대는 get메서드
		return name;
	}

	public void setName(String name) { // 변경할 대는 set 메서드
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		if (age < 0) {
			System.out.println("나이가 음수가 말이 되니 꺼져");
			this.age = 0;
		} else
			this.age = age;
	}

	public void print() {
		System.out.println("이름: " + name);
		System.out.println("나이: " + age);
		System.out.println("===========");
	}
}
