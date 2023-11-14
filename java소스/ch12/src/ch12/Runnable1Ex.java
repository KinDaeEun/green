package ch12;
//자바는 다중 상속이 단되므로 Thread를 상속 받지 못하는 경우가 발생
class Run1 implements Runnable{

	@Override
	public void run() {
		for (int i = 0; i < 30; i++) {
			//Thread.currentThread().getName() 현재 작업중인 쓰레드 이름
			System.out.print(Thread.currentThread().getName() + i + "\t");
			if (i % 10 == 9)
				System.out.println();
			try {
				Thread.sleep(300);// 0.3초 쉬아라 단위:1/1000ch
			} catch (InterruptedException e) {}
		}
	}
	
}


public class Runnable1Ex {
	public static void main(String[] args) {
		Run1 r1 = new Run1();
		Run1 r2 = new Run1();
		Run1 r3 = new Run1();
		Thread th1 = new Thread(r1,"1번");
		Thread th2 = new Thread(r2,"2번");
		Thread th3 = new Thread(r3,"3번");
		th1.start();
		th2.start();
		th3.start();

	}
}
