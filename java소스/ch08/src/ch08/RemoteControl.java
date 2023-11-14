package ch08;

public interface RemoteControl {
	int MAX_VOLUME = 10;
	int MIN_VOLUME = 0;
	void turnOn();
	void turnOff();
	
	//default는 구현부가 있다(자바 8.0부터)
	default void setMute(boolean mute) {
		if(mute)
			System.out.println("무음 처리합니다");
		else 
			System.out.println("무음 해제합니다");
	}
	//static도 구현부가 있다
	static void changeBattery() {
		System.out.println("건전지를 교환합니다");
	}
}
