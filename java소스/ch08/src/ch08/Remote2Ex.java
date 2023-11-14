package ch08;

public class Remote2Ex {
	public static void main(String[] args) {
		//클래스 생성한 것임 Remote2Ex$1.class.무명(익명) Inner 클래서
		RemoteControl rc = new RemoteControl() {
			public void turnOn() {
				System.out.println("스피커 켭니다");
			}

			public void turnOff() {
				System.out.println("스피커 끔니다");
			}

		};
		rc.turnOff();
		rc.turnOn();
		rc.setMute(false);
		RemoteControl.changeBattery();
		
		//클래스 생성한 것임 Remote2Ex$2
		RemoteControl rc2 = new RemoteControl() {
			public void turnOn() {
				System.out.println("스피커 켭니다");
			}
			
			public void turnOff() {
				System.out.println("스피커 끔니다");
			}
			
		};
		rc2.turnOff();
		rc2.turnOn();
		rc2.setMute(false);
		RemoteControl.changeBattery();

	}
}
