package ch07;

public class Circle2 extends Shape{
	Circle2(int line, int point){
		setLine(line);
		setPoint(point);
	}
	void print() {
		super.print();
		System.out.println("원");
	}
}
