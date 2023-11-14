package ch07;

public class OuterEx {
	public static void main(String[] args) {
		Outer out = new Outer(10,20);
		//Inner class는 직접 사용이 안되고 Outer class를 통해야 사용 가능
		//Inner inner = new Inner();
		//외부클래스.내부클래스 객체명 = 외부객체.내부객체 생성하는 메서드()
		Outer.Inner myInner = out.getInner();
		System.out.println("부피: "+myInner.volume());
		
		//외부클래스.내부클래스 객체명 = 외부객체.new 내부 객체
		Outer.Inner yourInner = out.new Inner();
		System.out.println("부피: "+yourInner.volume());
	}
}
