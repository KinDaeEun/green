package samp08;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class Ex01 {
	public static void main(String[] args) {
		ApplicationContext ac = new GenericXmlApplicationContext("classpath:beans08.xml");
		Vehicle v = ac.getBean(Vehicle.class);
		v.ride();
	}
}
