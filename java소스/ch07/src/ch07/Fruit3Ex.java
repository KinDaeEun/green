package ch07;

public class Fruit3Ex {
	public static void main(String[] args) {
		FruitSeller3 fs1 = new FruitSeller3("로제", 10, 0);
//		FruitSeller3 fs2 = new FruitSeller3("보검", 10, 0);

		FruitBuyer3 fb1 = new FruitBuyer3("하니", 0, 4000);
//		FruitBuyer3 fb2 = new FruitBuyer3("재니",0 , 10000);
		FruitBuyer3 fb3 = new FruitBuyer3("성재",0 , 10000);

		fb1.buyApple(fs1, 3000);
//		fb2.buyApple(fs2, 8000);
		fb3.buyApple(fs1, 8000);

		fs1.print();
//		fs2.print();
		fb1.print();
//		fb2.print();
		fb3.print();
		
		
		
		
		
		
		
		
		
		
		
		
//		FruitSeller3  fs1 = new FruitSeller3("제니",20,1000); 
//		FruitSeller3  fs2 = new FruitSeller3("보검",20,0); 
//		FruitBuyer3 fb1 = new FruitBuyer3("로제", 0,20000);
//		FruitBuyer3 fb2 = new FruitBuyer3("은우", 5,10000);
//		FruitBuyer3 fb3 = new FruitBuyer3("하니", 0,50000);
//		
//		fb1.buyFruit(fs1, 12000);
//		fb2.buyFruit(fs2, 9000);
//		fb3.buyFruit(fs1, 11000);
//		
//		fs1.print();
//		fs2.print();
//		fb1.print();
//		fb2.print();
//		fb3.print();
	}
}
