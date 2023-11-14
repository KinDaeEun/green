package ch07;

public class Outer {
	private int height;
	private int width;

	public Outer(int height, int width) {
		this.height = height;
		this.width = width;
	}

	public Inner getInner() {
		return new Inner();
	}

	class Inner { // Outer에 있는 변수나 메서드를 Inner가 자기것 처럼 사용
		private float rate = 0.5f;

		public float volume() {
			return rate * height * width;
		}
	}
}
