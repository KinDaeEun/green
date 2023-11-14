package ch12;
class Thread2 extends Thread{
	public Thread2(String title) {
		super(title);
	}
	public void run() {
		for (int i = 0; i < 30; i++) {
			System.out.print(getName() + i + "\t");
			if (i % 10 == 9)
				System.out.println();
			try {
				Thread.sleep(1);// 0.3초 쉬아라 단위:1/1000ch
			} catch (InterruptedException e) {}
		}
	}
}

public class Thread2Ex {
	public static void main(String[] args) {
		Thread2 th1 = new Thread2("첫번째 ");
		Thread2 th2 = new Thread2("두분째 ");
//		th1.run();
//		th2.run();
		th1.start();
		th2.start();
		for (int i = 0; i < 30; i++) {
			System.out.print("메인" + i + "\t");
			if (i % 10 == 9)
				System.out.println();
			try {
				Thread.sleep(300);// 0.3초 쉬아라 단위:1/1000ch
			} catch (InterruptedException e) {}
		}
	}
}
