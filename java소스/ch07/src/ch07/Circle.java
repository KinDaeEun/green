package ch07;

public class Circle extends Shape{
	Circle(int line, int point){
		setLine(line);
		setPoint(point);
	}
	void printCi() {
		print();
		System.out.println("원");
	}
}
