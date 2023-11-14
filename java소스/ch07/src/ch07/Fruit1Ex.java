package ch07;

public class Fruit1Ex {
	public static void main(String[] args) {
		FruitSeller1 fs1 = new FruitSeller1();
		FruitSeller1 fs2 = new FruitSeller1();
		
		FruitBuyer1  fb1 = new FruitBuyer1();
		FruitBuyer1  fb2 = new FruitBuyer1();
		
		fb1.buyApple(fs1, 4000);
		fs1.print();
		fb1.print();
		fb2.buyApple(fs2, 3000);
		fs2.print();
		fb2.print();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		FruitSeller1 fs1 = new FruitSeller1();
//		FruitSeller1 fs2 = new FruitSeller1();
//		FruitBuyer1 fb1 = new FruitBuyer1();
//		FruitBuyer1 fb2 = new FruitBuyer1();
//		FruitBuyer1 fb3 = new FruitBuyer1();
//
//		fb1.buyFruit(fs1, 3000);
//		fb2.buyFruit(fs2, 2000);
//		fb3.buyFruit(fs1, 2000);
//
//		fs1.print();
//		fs2.print();
//		fb1.print();
//		fb1.print();
//		fb1.print();
	}
}
