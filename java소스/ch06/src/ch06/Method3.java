package ch06;
class A1{
	static void add(int x, int y) {
		System.out.println(x+" + "+y+" = "+(x+y));
	}
	void minus(int x, int y) {
		System.out.println(x+" - "+y+" = "+(x-y));
	}
}
public class Method3 {
	public static void main(String[] args) {
		for(int i = 0; i<5; i++) {
			int x = (int)(Math.random()*10)+1;
			int y = (int)(Math.random()*10)+1;
			A1.add(x, y);
		}
		A1 a = new A1();
		System.out.println("=============");
		for(int i = 0; i<5; i++) {
			int x = (int)(Math.random()*10)+1;
			int y = (int)(Math.random()*10)+1;
			a.minus(x, y);
		}
	}
}
