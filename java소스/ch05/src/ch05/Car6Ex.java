package ch05;

class Car6 {
	String carNo; // 차량번호
	int inTime; // 입고시간
	int outTime;// 출고시간
	int fee;// 주차요금
	final int MONEY_PER_HOUR = 1000;

	Car6(String c, int i, int o) {
		carNo = c;
		inTime = i;
		outTime = o;
	}

	void calFee() {// 주차요금
		fee = (outTime - inTime) * MONEY_PER_HOUR;

	}

	void prn() {
		calFee();
		System.out.println("=================");
		System.out.println("차량번호: " + carNo);
		System.out.println("입고시간: " + inTime);
		System.out.println("출고시간: " + outTime);
		System.out.println("주차요금: " + fee);
	}
}

public class Car6Ex {
	public static void main(String[] args) {
		Car6 car1 = new Car6("가1234", 10, 13);
		Car6 car2 = new Car6("나3456", 9, 18);
		Car6 car3 = new Car6("다4312", 11, 16);
		Car6 car4 = new Car6("라2345", 8, 15);
		Car6 car5 = new Car6("마6545", 9, 20);

		Car6[] cars = { car1, car2, car3, car4, car5 };
		for (Car6 c : cars) {
			c.prn();
		}
	}
}
