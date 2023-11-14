package ch15;
@FunctionalInterface//함수적 인터페이스 인지 체크
//함수적 ㅇ니터페이스: 하나의 메서드만 가진 인터페이스
interface MyFuction1{
	public void method();
}
class MyFucClass implements MyFuction1{
	public void method() {
		System.out.println("난 재정의한 클래스");
	}
}
public class Lambda1Ex {
	public static void main(String[] args) {
		//interface는 선언은 되지만 생성은 할 수 없음
		MyFuction1 mc1 =  new MyFucClass();
		mc1.method();
		mc1 = new MyFuction1() { //무명(익명) 클래스
			public void method() {
				System.out.println("난 인터페이스로 직접 재정의");
			}
		};
		mc1.method();
		mc1 = () -> {System.out.println("람다로 처리한 메서드");};
		mc1.method();
	}
}
