package ch07;

public class CarEx {
	public static void main(String[] args) {
		Ambulance am = new Ambulance("구급차", 5);
		FireEngine fi = new FireEngine("소방차", 10);
		Bus bu = new Bus("버스", 20);

		am.printAm();
		fi.printFi();
		bu.printBu();
	}
}
