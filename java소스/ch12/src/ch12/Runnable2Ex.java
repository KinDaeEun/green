package ch12;
class run2 implements Runnable{

	public void run() {
		String[] colors = {"빨강","주황","노랑","초록","파랑","남색","보라"};
		for(String color: colors) {
			System.out.print(Thread.currentThread().getName() + color + "\t");
			try {
				Thread.sleep(300);
			} catch (InterruptedException e) {}
		}
	}
	
}
public class Runnable2Ex {
	public static void main(String[] args) {

		Run1 r1 = new Run1();
		Run1 r2 = new Run1();
		Run1 r3 = new Run1();
		
		Thread th1 = new Thread(r1,"1번");
		Thread th2 = new Thread(r1,"2번");
		Thread th3 = new Thread(r1,"3번");
		
		th1.start();
		th2.start();
		th3.start();
		
	}
}
