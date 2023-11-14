package ch13;
import java.util.Date;
public class Printer1 {
	public static void main(String[] args) {
		int i = 65;
		float f = 1234.56789f;
		Date d = new Date();
		System.out.printf("문자 %c의 코드는 %d\n", i, i);
		System.out.printf("문자 %c는 8진수로 %o\n", i, i);
		System.out.printf("문자 %c는 16진수로 %x\n", i, i);
		System.out.printf("%3d%3d%3d\n",100,90,80);
		System.out.println();
		System.out.printf("123456789012345678901234567890");
		System.out.printf("%s%-5s%5s\n","123","123","123");
		System.out.println();
		System.out.printf("%-8.2f%8.1f %e\n", f,f,f);
		System.out.printf("%ty년 %tm월 %td일\n", d,d,d);
		System.out.printf("%tH시 %tM분 %tS초\n", d,d,d);
		System.out.printf("%TF %TT\n", d, d);

	}
}