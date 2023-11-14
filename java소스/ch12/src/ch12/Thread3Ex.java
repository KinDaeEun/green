package ch12;
class Thread3 extends Thread{
	public Thread3(String title) {
		super(title);
	}
	public void run() {
		String[] colors = {"빨강","주황","노랑","초록","파랑","남색","보라"};
		for(String color:colors) {
			System.out.print(getName()+ color+"\t");
			try {
				Thread.sleep(300);
			} catch (InterruptedException e) {}
		}	
	}
}
public class Thread3Ex {
	public static void main(String[] args) {
		Thread3 th1 = new Thread3("첫번째");
		Thread3 th2 = new Thread3("두번째");
		//th1.run();
		//th2.run();
		th1.start();
		th2.start();
		String[] colors = {"빨강","주황","노랑","초록","파랑","남색","보라"};
		for(String color:colors) {
			System.out.print("메인"+ color+"\t");
			try {
				Thread.sleep(300);
			} catch (InterruptedException e) {}
		}
		
	}
}
