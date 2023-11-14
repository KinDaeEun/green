package ch05;

class QWER {

	static int i1=11 ; // program loading후 사용
	int i2;
	
	{ // instance 생성후에 사용
		i1 = 20;
		i2 = 30;
	}
	
	
}

public class A1 {
	public static void main(String[] args) {
		System.out.println("i1="+QWER.i1);

		
		QWER b1 = new QWER();
		 b1.i1 = 12; 
		 b1.i2 = 13; 
		System.out.println("i1="+b1.i1);
		System.out.println("i2="+b1.i2);

		
		QWER b2 = new QWER();
		System.out.println("i1="+b2.i1);
		System.out.println("i2="+b2.i2);
	}
}
