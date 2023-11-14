package ch12;

public class Account1 {
	private int total;
	public Account1(int total) {
		this.total = total;
	}
	synchronized void deposit(int amt,String name) {
		total += amt;
		System.out.println(name+"입금: "+amt);
	}
	synchronized void wihthdrwa(int amt, String name) {
		if(amt <= total) {
			total -= amt;
			System.out.println(name+"출금: "+amt);
		}else
			System.out.println("잔액이 부족합니다. 꺼져 !!");
	}
	void print() {
		System.out.println("통장 잔고: "+ total);
	}
}
