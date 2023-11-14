package ch15;

import java.util.*;
import java.util.stream.Stream;

class Student1 {
	private String name;
	private int age;

	public Student1(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}
}

public class Stream2Ex {
	public static void main(String[] args) {
		List<Student1> list = Arrays.asList(new Student1("로제", 26),
				new Student1("보검", 29),new Student1("제니", 25));
		Stream<Student1> stream = list.stream();
		stream.forEach(st -> {System.out.println(st.getName()+": "+st.getAge());});
	}
}


