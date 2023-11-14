package ch12;

public class Account1User extends Thread{
	boolean flag;
	Account1 act;
	String name;
	public Account1User(Account1 act, String name) {
		this.act = act;
		this.name = name;
	}
	public void run() {
		for(int i = 0;i<5;i++) {
			int amt = (int)(Math.random()*10000)+1;
			if(flag)
				act.deposit(amt, name);
			else 
				act.wihthdrwa(amt, name);
			flag = true;
			act.print();
		}
	}
}
