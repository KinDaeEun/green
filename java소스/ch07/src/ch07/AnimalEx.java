package ch07;

public class AnimalEx {
	public static void main(String[] args) {
		Animal a1 = new Pig();
		Animal a2 = new Bird();
		Animal a3 = new Fish();
		Animal a4 = new Animal();
		
		Animal [] animals = {a1,a2,a3,a4};
		for(Animal animal: animals) {
			animal.eat();
			animal.move();
			System.out.println(animal.x);

			if(animal instanceof Fish) {
				((Fish)animal).breath();
			}
			if(animal instanceof Pig) {
				
				System.out.println(((Pig)animal).x);
			}
			System.out.println("=====");
		}
		
		
		System.out.println("===========");
		
		Pig p1 = (Pig)a1;
		System.out.println(p1.x);
	}
}
