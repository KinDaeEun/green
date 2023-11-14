package ch08;

public interface Volume {
	void volumeUp();

	void volumeDown();
}

class Radio implements Volume {
	public void volumeUp() {
		System.out.println("라디오 볼륨을 올려요");
	}

	public void volumeDown() {
		System.out.println("라디오 볼륨을 내려요");
	}
}

class TV implements Volume {
	public void volumeUp() {
		System.out.println("TV 볼륨을 올려요");
	}

	public void volumeDown() {
		System.out.println("TV 볼륨을 내려요");
	}
}

class Speaker implements Volume {
	public void volumeUp() {
		System.out.println("스피커 볼륨을 올려요");
	}

	public void volumeDown() {
		System.out.println("스피커 볼륨을 내려요");
	}
}
