package ch05;

class A2 {
	{ //객체를 생성할 때 실행, instance초기화 블럭
		System.out.println("난 instance 초기화 블럭");
	}
	static { //A2라는 클래스를 사용하기 위해서 loading할 때 실행, 클래스 초기화 블럭
		System.out.println("난 static 초기화 블럭");
	}

}

public class Static3 {
	public static void main(String[] args) {
		A2 a1 = new A2();
		A2 a2 = new A2();
		A2 a3 = new A2();	
	}
}
