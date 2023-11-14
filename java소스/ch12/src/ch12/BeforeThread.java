package ch12;

public class BeforeThread extends Thread{
	public BeforeThread(String title) {
		super(title);
	}
	void addCar() {
		System.out.println("add car");
		joinTest.carList.add("소나타");
		joinTest.carList.add("말두타");
		joinTest.carList.add("개두타");
		joinTest.carList.add("냥이도타");
	}
	public void run() {
		addCar();
		System.out.println(getName()+"실행");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {}
	}
}
