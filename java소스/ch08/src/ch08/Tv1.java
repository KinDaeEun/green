package ch08;

public class Tv1 implements RemoteControl {
	public void turnOn() {
		System.out.println("TV를 켭니다");
	}

	public void turnOff() {
		System.out.println("TV를 끔니다");
	}
}

class Radio1 implements RemoteControl {
	public void turnOn() {
		System.out.println("라디오를 켭니다");
	}

	public void turnOff() {
		System.out.println("라디오를 끔니다");
	}
}
