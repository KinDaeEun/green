package samp06;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Ex01 {
	public static void main(String[] args) {
		ApplicationContext ac = new FileSystemXmlApplicationContext("beans05.xml");
		Vehicle v = ac.getBean(Vehicle.class);
		v.ride();
	}
}
