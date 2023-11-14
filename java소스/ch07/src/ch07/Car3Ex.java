package ch07;

public class Car3Ex {
	private static final String FireEngine3 = null;

	public static void main(String[] args) {

		// 부모선언 자식생성 up casting 문제 없음
		Car3 c1 = new FireEngine3();
		Car3 c2 = new Ambulance3();
		// 자식을 선언 = 부모 대립 down casting, 강제 형변환
		// c1은 원래 FireEngined이므로 문제 없음
		FireEngine3 fe1 = (FireEngine3) c1;
		// c2는 원래 앰블런스이므로 컴파일할 때는 문제 없지만 실행하면 에러
		// FireEngine3 fe2 = (FireEngine3)c2;
		// 부모를 선언하고 자식을 대입했을 경우에는
		// 부모의 메서드 이름에 있는 메서드만 실행가능
		// 똑같은 이름의 메서드가 자식도 있으면 자식 메서드 내용으로 실행한다
		// method는 overriding 기능으로 자식메서드가 덮어쓴다
		c1.drive();
		c1.stop();
		// c1.water();
		((FireEngine3)c1).water();
		System.out.println("========");
		c2.drive();
		c2.stop();
		((Ambulance3)c2).siren();
		System.out.println("========");
		// 자식으로 형변환하면 자식이 가진 메서드도 실행 가능
		fe1.stop();
		fe1.drive();
		fe1.water();
		System.out.println("========");
		// 부모와 같은 이름의 변수는 부모것이 출력된다
		// 변수는 이름은 같지만 다른 변수로 인식
		System.out.println("색깔: " + c1.color);
	}
}
