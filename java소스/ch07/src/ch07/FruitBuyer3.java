package ch07;

public class FruitBuyer3 {

	int numOfApple;
	int money;
	String name;

	public FruitBuyer3(String name, int numOfApple, int money) {
		this.name = name;
		this.numOfApple = numOfApple;
		this.money = money;
	}

	void buyApple(FruitSeller3 fs, int amt) {

		int num = fs.saleApple(amt);
		if (num > 0&&money>amt) {
			money -= amt;
			numOfApple += num;
		}
	}

	void print() {
		System.out.println(name + "사과 갯수: " + numOfApple);
		System.out.println(name + "재산:" + money);
	}

//	int numOfApple;
//	int money;
//	String name;
//
//	FruitBuyer3(String name, int numOfApple, int money) {
//		this.name = name;
//		this.money = money;
//		this.numOfApple = numOfApple;
//	}
//
//	void buyFruit(FruitSeller3 fs, int amt) {
//		if (money < amt)
//			System.out.println("돈이 떨어졌네");
//		else {
//			int num = fs.saleApple(amt);
//			if (num != 0) {
//				money -= amt;
//				numOfApple += num;
//				System.out.printf("%s 사과 득템 %d개 지출 %d원\n", name, num, amt);
//			}else 
//				System.out.println("못 샀어, 떨어졌대");
//		}
//		int num = fs.saleApple(amt); // 구매한 사과 갯수
//		money -= amt;
//		numOfApple += num;
//	}
//
//	void print() {
//		System.out.println(name + "의 사과갯수: " + numOfApple);
//		System.out.println(name + "의 금전잔액: " + money);
//		System.out.println("============");
//	}
}
