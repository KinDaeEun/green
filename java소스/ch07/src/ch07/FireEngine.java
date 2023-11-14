package ch07;

public class FireEngine extends Car {


	FireEngine(String kind, int inwon) {
		setKind(kind);
		setInwon(inwon);

	}

	void printFi() {
		print();
		System.out.println("불끄러간다");
	}
}
