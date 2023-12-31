package samp01;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class MessageBeanImpl implements MessageBean, BeanNameAware, BeanFactoryAware, InitializingBean, DisposableBean {
	private String greeting;
	public MessageBeanImpl() {
		System.out.println("① Bean의 생성자");
	}
	public void setGreeting(String greeting) {
		System.out.println("② 세터메서드 실행");
		this.greeting = greeting;
	}
	public void setBeanName(String name) {
		System.out.println("③ Bean의 이름");
	}
	public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
		System.out.println("④ Bean Factory 지정");
	}
	public void afterPropertiesSet() throws Exception {
		System.out.println("⑥ Property 지정 완료");
	}
	public void init() {
		System.out.println("⑦ 초기화 메서드 지정");
	};
	public void sayHelo() {
		System.out.println(greeting + " !!!");
	}
	public void destroy() throws Exception {
		System.out.println("종료");
	}
}
