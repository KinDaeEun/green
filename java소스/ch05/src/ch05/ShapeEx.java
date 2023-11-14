package ch05;

class Shape {
	int width, height, dept; // 멤버변수/instance변수

	Shape(int w) { // int w 메개변수
		width = w;
	}

	Shape(int w, int h) {
		width = w;
		height = h;
	}

	Shape(int w, int h, int d) {
		width = w;
		height = h;
		dept = d;
	}

	void square() {
		System.out.println("정사각형 면접: " + width * width);
	}

	void rectangle() {
		System.out.println("직사각형 면접: " + width * height);
	}

	void hexa() {
		System.out.println("직육면체 부피: " + width * height * dept);
	}

}

public class ShapeEx {
	public static void main(String[] args) {
		Shape s1 = new Shape(10); // s1 참조변수, (10)매게변수
		s1.square();

		Shape s2 = new Shape(10, 20);
		s2.rectangle();

		Shape s3 = new Shape(10, 20, 30);
		s3.hexa();
	}
}
