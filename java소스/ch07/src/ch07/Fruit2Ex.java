package ch07;

public class Fruit2Ex {
	public static void main(String[] args) {
		FruitSeller2 fs1 = new FruitSeller2("로제", 20, 0);
		FruitSeller2 fs2 = new FruitSeller2("보검", 10, 1000);

		FruitBuyer2 fb1 = new FruitBuyer2("하니", 0, 20000);
		FruitBuyer2 fb2 = new FruitBuyer2("재니", 10, 10000);

		fb1.buyApple(fs1, 9000);
		fb2.buyApple(fs2, 8000);

		fs1.print();
		fs2.print();
		fb1.print();
		fb2.print();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

//		FruitSeller3  fs1 = new FruitSeller3("제니",30,1000); 
//		FruitSeller3  fs2 = new FruitSeller3("보검",20,0); 
//		FruitBuyer2 fb1 = new FruitBuyer2("로제", 0,20000);
//		FruitBuyer2 fb2 = new FruitBuyer2("은우", 5,10000);
//		FruitBuyer2 fb3 = new FruitBuyer2("하니", 0,50000);
//		
//		fb1.buyFruit(fs1, 3000);
//		fb2.buyFruit(fs2, 7000);
//		fb3.buyFruit(fs1, 5000);
//		
//		fs1.print();
//		fs2.print();
//		fb1.print();
//		fb2.print();
//		fb3.print();
	}
}
