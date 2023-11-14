package ch07;

public class Shape {
	private int line;
	private int point;

	public int getLine() {
		return line;
	}

	public void setLine(int line) {
		this.line = line;
	}

	public int getPoint() {
		return point;
	}

	public void setPoint(int point) {
		this.point = point;
	}

	void print() {
		System.out.println("===========");
		System.out.println("선: " + line);
		System.out.println("점: " + point);
	}
}
