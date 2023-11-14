package ch06;

class Juice2 {

	Juice2(String name, int kor, int eng) {

		System.out.println(name + kor + eng);
	}

	Juice2(String name, int kor) {
		this(name,90,80);
		System.out.println(name + kor);
	}

	Juice2(String name) {
		this(name,90);
		System.out.println(name);
	}

	Juice2() {
		this("하은");
		System.out.println("맴버변수 없다");
	}
}
	public  class Juice2Ex {
		public static void main(String[] args) {
			Juice2 ju = new Juice2();
		}
	}

