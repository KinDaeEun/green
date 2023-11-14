package ch05;

public class Info {
	String name;
	int age;
	String hobby;

	Info(String n, int a, String h) {
		name = n;
		age = a;
		hobby = h;
	}

	void prn() {
		System.out.println("이름: " + name);
		System.out.println("나이: " + age);
		System.out.println("취미: " + hobby);
		System.out.println("=============");
	}

}
