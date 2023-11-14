package ch07;
class G1{
	G1(){
		System.out.println("배개변수 없는 생성자");
	}
	G1(int x){
		System.out.println("매개변수 1개: "+x);
	}
}
class G2 extends G1{
	String name;
	
	G2(String name, int x){
		super(x);
		System.out.println("맴버변수 2개: "+name+", "+x);
		this.name = name;
	}
	void disp() {
		System.out.println("이름: "+name);
	}
}
public class Super3Ex {
	public static void main(String[] args) {
		G2 g = new G2("은우",15);
		g.disp();
	}
}
