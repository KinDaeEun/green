package samp07;

public class MessageBeanImpl implements MessageBean {
	private String name;
	private String greeting;



	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGreeting() {
		return greeting;
	}

	public void setGreeting(String greeting) {
		this.greeting = greeting;
	}

	public void sayHello() {
		System.out.println(name+"!!! "+greeting);
	}
}
