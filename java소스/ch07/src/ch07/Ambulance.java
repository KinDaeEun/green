package ch07;

public class Ambulance extends Car {


	Ambulance(String kind, int inwon) {
		setKind(kind);
		setInwon(inwon);
	}

	void printAm() {
		print();
		System.out.println("환자싣고 간다");
	}
}
