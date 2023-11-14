package ch11;

import java.util.ArrayList;
import java.util.List;

public class CarEx {
	public static void main(String[] args) {
		//Generic Car 크래스를 사용하면 그 클래스를 상속받거나 구현한 클래스만 사용가능
		List<Car> list = new ArrayList<>();
		list.add(new Bus());
		list.add(new Taxi());
		list.add(new FireEngine());
		//list.add(new Ambulance()); //Car를 구현하지 않아서 사용 못함
		for(Car c:list) {
			c.move();
			if(c instanceof Bus)
				((Bus) c).prn();
		}
	}
}
