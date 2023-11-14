package ch12;
class Daemon1 extends Thread{
	public void run() {
		while(true) {
			System.out.println("데몬");
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {}
		}
	}
}
public class DaemonEx  {
	public static void main(String[] args) {
		Daemon1 dm = new Daemon1();
		//메인작업이 끝나면 모든 쓰레드도 종료
		dm.setDaemon(true);
		dm.start();
		for(int i = 1; i<=20;i++) {
			System.out.println(i);
			try {
				Thread.sleep(300);
			} catch (InterruptedException e) {}
		}
	}
}
