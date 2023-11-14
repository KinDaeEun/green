package ch08;

class Person {
	int leg = 2;

	void move() {
		System.out.println("두 다리로 걷는다");
	}
}

interface Fish {
	void swim();
}

interface a {
	void d();
}

//interface 다중 상속을 지원
public class Mermaid extends Person implements Fish, a {
	public void swim() {
		System.out.println("물속에서 수영한다");
	}
	public void d() {
		
	}

}
