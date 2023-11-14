package samp07;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;
public class Ex01 {
	public static void main(String[] args) {
//		classpath src/main/resources를 지칭
		AbstractApplicationContext ac = 
			new GenericXmlApplicationContext("classpath:beans07.xml");
		MessageBean mb = ac.getBean(MessageBean.class);
		mb.sayHello();
		ac.close();
	}
}
