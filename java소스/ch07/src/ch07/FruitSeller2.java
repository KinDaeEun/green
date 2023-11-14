package ch07;

public class FruitSeller2 {
	final int PRICE_PER_APPLE = 1000;
	int numOfApple;
	int money;
	String name;
	
	public FruitSeller2(String name, int numOfApple,int money) {
		this.name = name;
		this.numOfApple = numOfApple;
		this.money = money;
		
	}
	int saleApple(int amt) {
		money+=amt;
		int num = amt/PRICE_PER_APPLE;
		numOfApple-=num;
		return num;
	}
	void print(){
		System.out.println(name+"사과 갯수: " + numOfApple);
		System.out.println(name+"재산:" + money);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
//	final int PRICE_PER_APPLE = 1000;
//
//	public FruitSeller2(String name ,int numOfApple, int money) {
//		this.name = name;
//		this.numOfApple = numOfApple;
//		this.money = money;
//	}
//
//	int saleApple(int amt) {
//		money += amt;
//		int num = amt / PRICE_PER_APPLE;
//		numOfApple -= num;
//		return num;
//	}
//
//	void print() {
//		System.out.println(name + "판매자 사과갯수: " + numOfApple);
//		System.out.println(name + "판매자 금전잔액: " + money);
//		System.out.println("============");
//
//	}

}
