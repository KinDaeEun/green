package ch07;

public class Rectange extends Shape {
	Rectange(int line, int point){
		setLine(line);
		setPoint(point);
	}
	void printRe() {
		print();
		System.out.println("사각형");

	}
}
