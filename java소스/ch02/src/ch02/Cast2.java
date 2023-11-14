package ch02;

public class Cast2 {
	public static void main(String[] args) {
		int l1 = 67;
		int i1 = (int)l1;	// down casting은 반드시 형변환 
		int i2 = 789;
		long l2 = i2;
		System.out.println("l1 = "+l1);
		System.out.println("i1 = "+i1);
		System.out.println("i2 = "+i2);
		System.out.println("l2 = "+l2);
	}
}
