package ch09;

public class CardEx {
	public static void main(String[] args) {
		Card c1 = new Card("스페이드", 10);
		Card c2 = new Card("스페이드", 7);
		Card c3 = new Card("하트", 10);
		
		if(c1.equals(c2))
			System.out.println("c1이랑 c2같다");
		else
			System.out.println("c1이랑 c2다르다");
		if(c1.equals(c3))
			System.out.println("c1이랑 c3같다");
		else
			System.out.println("c1이랑 c3다르다");
		if(c2.equals(c3))
			System.out.println("c2이랑 c3같다");
		else
			System.out.println("c2이랑 c3다르다");
		
		System.out.println("c1: "+c1);
		System.out.println("c2: "+c2);
		System.out.println("c3: "+c3);
	}
}
