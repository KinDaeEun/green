package ch07;

public class FruitSeller1 {
	int numOfApple = 20;
	int money = 0;
	final int PRICE_PER_APPLE = 1000;

	int saleApple(int amt) {
		money += amt;
		int num = amt / PRICE_PER_APPLE;
		numOfApple -= num;
		return num;
	}

	void print() {
		System.out.println("사과 갯수: " + numOfApple);
		System.out.println("재산:" + money);

	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
//	int saleApple(int amt) {
//		money+=amt;
//		int num=amt/PRICE_PER_APPLE;
//		numOfApple-=num;
//		return num;
//	}
//	void print() {
//		System.out.println("판매자 사과갯수: "+numOfApple);
//		System.out.println("판매자 금전잔액: "+money);
//	}
//	
}
