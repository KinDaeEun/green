package ch07;

public class Triangle extends Shape {
	Triangle(int line, int point){
		setLine(line);
		setPoint(point);
	}
	void printTr() {
		print();
		System.out.println("삼각형");

	}
}
