package ch07;

public class Car3Ex2 {
	public static void main(String[] args) {
		Car3 c1 = new FireEngine3();
		Car3 c2 = new Ambulance3();
		Car3[] cars = { c1, c2 };
		for (Car3 car : cars) {
			car.drive();
			car.stop();
			// car가 원래 FireEngine인 경우는 실행됨, 즉 c1
			// c2일 때는 에러 발생
			//instanceof 현재 car 는 FireEngine3으로 생성된 객체
			if (car instanceof FireEngine3) {
				((FireEngine3) car).water();
//				FireEngine3 c = (FireEngine3)car;				
//				c.water();
			}

			if (car instanceof Ambulance3)
				((Ambulance3) car).siren();
		}
	}
}
