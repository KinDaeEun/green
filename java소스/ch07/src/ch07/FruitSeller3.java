package ch07;

public class FruitSeller3 {
	final int PRICE_PER_APPLE = 1000;
	int numOfApple;
	int money;
	String name;
	
	public FruitSeller3(String name, int numOfApple,int money) {
		this.name = name;
		this.numOfApple = numOfApple;
		this.money = money;
		
	}
	int saleApple(int amt) {
		
		int num = amt/PRICE_PER_APPLE;
		if(num<numOfApple) {
			money+=amt;
		    numOfApple-=num;
		}else {
			num = 0;
		}
		return num;
	}
	void print(){
		System.out.println(name+"사과 갯수: " + numOfApple);
		System.out.println(name+"재산:" + money);
	}
	
	
	
	
	
	
	
	
	
	
	
//	int numOfApple;
//	int money;
//	String name;
//	final int PRICE_PER_APPLE = 1000;
//
//	public FruitSeller3(String name ,int numOfApple, int money) {
//		this.name = name;
//		this.numOfApple = numOfApple;
//		this.money = money;
//	}
//
//	int saleApple(int amt) {
//		int num = amt / PRICE_PER_APPLE;
//		if(numOfApple>=num) {
//			money += amt;
//			numOfApple -= num;
//			System.out.printf("%d개 판매 수입 %d원\n",num,amt);
//		}else {
//			System.out.println("사과 다 팔렸어, 못팔아");
//			num = 0;
//		}
//
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
