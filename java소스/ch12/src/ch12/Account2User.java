package ch12;

public class Account2User extends Thread{
	boolean flag;
	Account2 act;
	String name;
	public Account2User(Account2 act, String name) {
		this.act = act;
		this.name = name;
	}
	public void run() {
		for(int i = 0;i<5;i++) {
			synchronized (act) {
				int amt = (int)(Math.random()*10000)+1;
				if(flag)
					act.deposit(amt, name);
				else 
					act.wihthdrwa(amt, name);
			}
			flag = true;
			act.print();
		}
	}
}
