package samp04;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Ex01 {
	public static void main(String[] args) {
		ApplicationContext ac = new FileSystemXmlApplicationContext("beans01.xml");
		Vehicle v = ac.getBean("v",Vehicle.class);
		//Vehicle v = ac.getBean("a",Vehicle.class);
		//Vehicle v = (Vehicle)ac.getBean("a");
//		Vehicle v = (Vehicle)ac.getBean(Vehicle.class);
		
		v.ride("보검");
	}
}
