package ch05;

class Account {
	String accountNo; // 계좌번호
	String name; // 예금주
	int balance; // 잔액

	Account(String a, String n, int b) {
		accountNo = a;
		name = n;
		balance = b;
	}

	void deposit(int money) {
		balance += money;
		System.out.println(name + "입금: " + money);
	}

	void withdrwa(int money) {
		if (balance >= money) {
			balance -= money;
			System.out.println(name + "출금: " + money);
		}else
			System.out.println("꺼져 돈 없어");
	}

	void disp() {
		System.out.println("계좌번호: " + accountNo);
		System.out.println("예금주: " + name);
		System.out.println("잔액: " + balance);
		System.out.println("===============");
	}

}

public class AccountEx {
	public static void main(String[] args) {
		Account p1 = new Account("국민1234", "보검", 1000);
		Account p2 = new Account("우리1234", "하니", 2000);
		Account p3 = new Account("하나1234", "제니", 3000);
		int money = 0;
		for (int i = 0; i < 2; i++) {
			money = (int) (Math.random() * 100 + 1);
			p1.deposit(money);
			money = (int) (Math.random() * 100 + 1);
			p1.withdrwa(money);
		}
		p1.disp();
		for (int i = 0; i < 2; i++) {
			money = (int) (Math.random() * 100 + 1);
			p2.deposit(money);
			money = (int) (Math.random() * 100 + 1);
			p2.withdrwa(money);
		}
		p2.disp();
		for (int i = 0; i < 2; i++) {
			money = (int) (Math.random() * 100 + 1);
			p3.deposit(money);
			money = (int) (Math.random() * 100 + 1);
			p3.withdrwa(money);
		}
		p3.disp();

	}
}
