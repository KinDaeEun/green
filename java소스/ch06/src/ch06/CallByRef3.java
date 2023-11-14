package ch06;
class D3{
	int x;
	int y;
//	void swap(D3 d3) {
//		int temp = d3.x;
//		d3.x = d3.y;
//		d3.y = temp;
//		
//		System.out.println("swap x = "+d3.x);
//		System.out.println("swap y = "+d3.y);
//	}
	void swap(D3 d3) {
		d3.x++;
		d3.y++;
		System.out.println(d3.x+d3.y);
	}
}
public class CallByRef3 {
	public static void main(String[] args) {
//		D3 d3 = new D3();
//		d3.x = 7;
//		d3.y = 3;//둘다 같이 바귐
//		d3.swap(d3); //매개변수가 참조형일 경우에는 주소가 전달
//		System.out.println("main x = "+d3.x);
//		System.out.println("main y = "+d3.y);
		D3 d3 = new D3();
		d3.x = 7;
		d3.y = 8;
		System.out.println(d3.x+d3.y);
		d3.swap(d3);
		System.out.println(d3.x+d3.y);
	}
}
