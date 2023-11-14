package ch12;

public class Account2 {
	private int total;
	public Account2(int total) {
		this.total = total;
	}
	void deposit(int amt,String name) {
		total += amt;
		System.out.println(name+"입금: "+amt);
	}
	void wihthdrwa(int amt, String name) {
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
