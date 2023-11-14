package samp10;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class Ex01 {
	public static void main(String[] args) {
		ApplicationContext ac = new GenericXmlApplicationContext("/samp10/beans10.xml");
		Vehicle v = ac.getBean(Vehicle.class);
		v.ride();
	}
}
