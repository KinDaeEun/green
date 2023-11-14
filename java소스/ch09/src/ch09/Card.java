package ch09;

public class Card {
	String kind;
	int number;

	Card(String kind, int number) {
		this.kind = kind;
		this.number = number;
	}

//	public boolean equals(Card obj) {
//
//		return kind.equals(obj.kind);
//	}

	public boolean equals(Card obj) {

		return number==(obj).number;
	}

	public String toString() {

		return "카드[종류: " + kind + ", 번호: " + number+"]";
	}
}
