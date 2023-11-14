package ch08;

public abstract class Shape {
	abstract void draw();
	abstract void area();
}
class Cirecle extends Shape{
	void draw() {
		System.out.println("원을 그린다");
	}
	void area() {
		System.out.println("원의 면적은 PI * 반지름 제곱");
	}
}
class Rectangle extends Shape{
	void draw() {
		System.out.println("사각형을 그린다");
	}
	void area() {
		System.out.println("사각형의 면적은 가로 * 세로");
	}
}
class Triangle extends Shape{
	void draw() {
		System.out.println("삼각형을 그린다");
	}
	void area() {
		System.out.println("삼각형의 면적은 가로 * 세로 / 2 ");
	}
}
