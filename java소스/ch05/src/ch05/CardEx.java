package ch05;

class Card {
	String kind;
	int number;
	static int width, height;

	void disp() {
		System.out.printf("%s, %d, %d, %d\n", kind, number, width, height);
		System.out.println("=====================");
	}
}

public class CardEx {
	public static void main(String[] args) {
		Card.width = 100;
		Card.height = 250;

		Card card1 = new Card();
		card1.kind = "스페이드";
		card1.number = 7;
//		card1.width = 100;
//		card1.height = 250;
		card1.disp();

		Card card2 = new Card();
		card2.kind = "하트";
		card2.number = 1;
		card2.disp();

		Card card3 = new Card();
		card3.kind = "클로바";
		card3.number = 10;
		card3.disp();
	}
}
