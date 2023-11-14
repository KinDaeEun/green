package ch08;

interface Bird {
	void eat();
}
class Monster extends Person implements Bird, Fish {
	public void eat() {
		System.out.println("부리로 쪼아 먹는다");
	}

	public void swim() {
		System.out.println("물속에서 오랫동안 헤엄 친다");
	}
}

public class MonsterEx {
	public static void main(String[] args) {
		Monster m = new Monster();
		m.eat();
		m.swim();
		m.move();
		System.out.println(m.leg);
	}
}
