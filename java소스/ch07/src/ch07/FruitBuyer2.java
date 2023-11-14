package ch07;

public class FruitBuyer2 {
	int numOfApple;
	int money;
	String name;
	
	public FruitBuyer2(String name, int numOfApple,int money){
		this.name = name;
		this.numOfApple = numOfApple;
		this.money = money;
	}
	void buyApple( FruitSeller2 fs, int amt) {
		money-=amt;
		int num = fs.saleApple(amt);
		numOfApple+=num;
	}
	void print() {
		System.out.println(name+"사과 갯수: " + numOfApple);
		System.out.println(name+"재산:" + money);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

//	FruitBuyer2(String name, int numOfApple,int money) {
//		this.name = name;
//		this.money = money;
//		this.numOfApple = numOfApple;
//	}
//
//	void buyFruit(FruitSeller3 fs, int amt) {
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
