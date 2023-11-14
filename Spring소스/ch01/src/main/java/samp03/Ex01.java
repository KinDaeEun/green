package samp03;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Ex01 {
	public static void main(String[] args) {
		ApplicationContext ac = new FileSystemXmlApplicationContext("beans01.xml");
		MessageBean mb = ac.getBean("me",MessageBean.class);
		mb.sayHello("보검");

	}
}
