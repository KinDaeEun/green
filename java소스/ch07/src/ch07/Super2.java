package ch07;
class E1{
	int k1 = 5;
	E1(){
		System.out.println("매개변수가 없는 생선자");
	}
	E1(String name){
		System.out.println("매개변수 1개: "+ name);
	}
	E1(int k1){
		System.out.println("매개변수 1개: "+ k1);
		this.k1 = k1;
	}
}
class E2 extends E1{
	E2(){ //특별한 조건이 없으면 defult 생성자(매개변수 없는 것)생성자를 호출하여 먼저 생성
//		super("로빈"); //부모 생성자중에서 매개변수가 문자열 1개인 것을 먼저 생성 요청
		super(7); // supe() 생성자의 첫째 줄에 있어야 한다
		System.out.println("자식 생성자");
	}
}
public class Super2 {
	public static void main(String[] args) {
		E2 e = new E2();
		System.out.println("k1 = "+e.k1);
	}
}
