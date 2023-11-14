package ch09;
import java.util.Random;
public class Random1 {
	public static void main(String[] args) {
		Random ran = new Random();
		System.out.println("0부터 99까지 난수"+ran.nextInt(100));
		System.out.println("1부터 100까지 난수"+(ran.nextInt(100)+1));
		
		System.out.println("정수 난수: "+ran.nextInt(10));
		System.out.println("float 난수: "+ran.nextFloat());
		System.out.println("double 난수: "+ran.nextDouble());
		System.out.println("long 난수: "+ran.nextLong());
		System.out.println("boolean 난수: "+ran.nextBoolean());
	}
}
