package ch05;

class Box {
	static int width =0;int height, depth;

	void wide() {
		System.out.println(width+" "+"박스의 넓이: " + width * height);
	}

	void volume() {
		System.out.println("박스의 부피: " + width * height * depth);
	}
}

public class BoxEx {
	public static void main(String[] args) {
		Box.width = 1;
		Box b1 = new Box();
		b1.width = 10;
		b1.height = 20;
		b1.depth = 30;
		b1.wide();
		b1.volume();

		Box b2 = new Box();
		b2.width = 12;
		b2.height = 15;
		b2.depth = 20;
		b2.wide();
		b2.volume();
	}
}
