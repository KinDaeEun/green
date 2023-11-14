package ch07;

public class FruitBuyer1 {
	int numOfApple = 0;
	int money = 5000;
	
	void buyApple(FruitSeller1 fs,int amt) {
		int num = fs.saleApple(amt);
		money-=amt;
		numOfApple+=num;
	}
	void print() {
		System.out.println("사과 갯수: " + numOfApple);
		System.out.println("재산:" + money);

	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
//	
//
//	void buyFruit(FruitSeller1 fs, int amt) {
//		int num = fs.saleApple(amt); // 구매한 사과 갯수
//		money -= amt;
//		numOfApple += num;
//	}
//
//	void print() {
//		System.out.println("구매자 사과갯수: " + numOfApple);
//		System.out.println("구매자 금전잔액: " + money);
//	}
}
