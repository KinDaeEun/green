package ch12;

//class Thread1 extends Thread {
//	@Override
//	public void run() {
//		for (int i = 0; i < 30; i++) {
//			System.out.print("쓰레드" + i + "\t");
//			if (i % 10 == 9)
//				System.out.println();
//			try {
//				Thread.sleep(300);// 0.3초 쉬아라 단위:1/1000ch
//			} catch (InterruptedException e) {}
//		}
//	}
//}
class Thread1 extends Thread{
	public void run() {
		for(int i = 0;i<30;i++) {
			System.out.print("쓰레드"+i+"\t");
			if(i%10 ==9)
				System.out.println();
			try {
				Thread.sleep(300);
			} catch (InterruptedException e) {}
		}
	}
}


public class Thread1Ex {
	public static void main(String[] args) {
		Thread1 th1 = new Thread1();
		Thread1 th2 = new Thread1();
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
