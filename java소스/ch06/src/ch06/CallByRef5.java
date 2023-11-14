package ch06;
class D5{
	int x;
	int y;
	void swap(D5 d5) {
		d5.x++;
		d5.y++;
		System.out.println(d5.x+d5.y);
	}
}
public class CallByRef5 {
	public static void main(String[] args) {
		D5 d5 = new D5();
		d5.x = 4;
		d5.y = 9;
		d5.swap(d5);
		System.out.println(d5.x+d5.y);
	}
}
