package ch09;

public class Person {
	String tel;
	String name;
	int age;

	public Person(String tel, String name, int age) {
		this.tel = tel;
		this.name = name;
		this.age = age;
	}

//	public boolean equals(Object obj) {
//		Person person = (Person)obj; //비교 대상
//		return tel.equals(person.tel);
//	}

	public boolean equals(Person obj) {

		return name.equals(obj.name);
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "이름:"+name+", 나이: "+age+", 전화: "+tel;
	}
	
}
