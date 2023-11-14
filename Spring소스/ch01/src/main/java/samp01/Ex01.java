package samp01;

public class Ex01 {
	public static void main(String[] args) {
		MessageBeanEn mbe = new MessageBeanEn();
		mbe.sayHello("Andy");
		MessageBeanKr mbk = new MessageBeanKr();
		mbk.sayHello("대은");
		String a = "1234567";
		System.out.println(a.substring(2,5));
	}
}
