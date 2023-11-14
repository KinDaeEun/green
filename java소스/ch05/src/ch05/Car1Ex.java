package ch05;

public class Car1Ex {
	public static void main(String[] args) {
		// 객체 선언 객체 생성
		Car1 myCar = new Car1();
		Car1 yourCar; // myCar/yourCar 객체명, 참조변수, reference명
		yourCar = new Car1();
		myCar.color = "빨강"; // 참조변수명.멤버변수로 사용
		myCar.displacement = 1500;
		myCar.kind = "소나타";
		System.out.println(myCar.color);
		myCar.disp();

		yourCar.color = "파란";
		yourCar.displacement = 7000;
		yourCar.disp();
		
		myCar.stop();
		yourCar.speedUp();
	}
}
