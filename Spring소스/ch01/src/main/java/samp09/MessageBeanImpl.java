package samp09;
public class MessageBeanImpl implements MessageBean {
	private String name;
	private String greeting;
	private Output output;
	
	public void setName(String name) {
		this.name = name;
	}
	public void setGreeting(String greeting) {
		this.greeting = greeting;
	}
	public void setOutput(Output output) {
		this.output = output;
	}
	public void sayHello() {
		String msg = name+" !!! "+greeting;
		System.out.println(msg);
		output.out(msg);
	}
}