package ch12;
class Run3 implements Runnable{


	public void run() {
		for(int i = 0;i<10;i++) {
			System.out.println(Thread.currentThread().getName()+"헐~");
			try {
				Thread.sleep(300);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
}
public class Ex01 {
	public static void main(String[] args) {
		Run3 r = new Run3();
		Thread th = new Thread(r,"run");
		th.start();
	}
}
