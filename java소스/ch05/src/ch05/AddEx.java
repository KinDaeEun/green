package ch05;

import pac.Add;

public class AddEx {
	public static void main(String[] args) {
//		pac.Add a1 = new pac.Add();
		Add a1 = new Add();
		a1.x = 12;
		a1.y = 20;
		a1.add();
		System.out.println(a1.x);
		
		
		Add a2 = new Add();
		System.out.println(a2.x);
	}
	
}
