package ch08;

public class ShapeEx {
	public static void main(String[] args) {

		Shape s1 = new Cirecle();
		Shape s2 = new Rectangle();
		Shape s3 = new Triangle();
		
		Shape[] shapes = {s1,s2,s3};
		for(Shape shape: shapes) {
			shape.draw();
			shape.area();
		}
	}
}
