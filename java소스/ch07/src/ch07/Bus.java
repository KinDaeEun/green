package ch07;

public class Bus extends Car {

	Bus(String kind, int inwon) {
		setKind(kind);
		setInwon(inwon);

	}

	void printBu() {
		print();
		System.out.println("승객 많이 싣고 간다");
	}
}
