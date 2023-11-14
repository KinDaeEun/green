package ch07;

public class Animal {
	int x = 7;
	void move() {
		System.out.println("움직인다");
	}
	void eat() {
		System.out.println("먹는다");
	}
}
class Pig extends Animal{
	int x = 10;
	void move(){
		System.out.println("네발로 기어 다닌다");
	}
}
class Bird extends Animal{
	void move() {
		System.out.println("날개로 날아 다닌다");
	}
	void eat() {
		System.out.println("eat");
	}
	
	
}
class Fish extends Animal{
	void move() {
		System.out.println("지느러미로 헤엄친다");
	}
	void breath() {
		System.out.println("아마미로 숨쉰다");
	}
}
