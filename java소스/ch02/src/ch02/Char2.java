package ch02;

public class Char2 {

	public static void main(String[] args) {
//		%s 문자열 %c 문자 %d 정수
//		(int)'A'는 문자 A를 ascii코드에 해당하는 정수로 변경하라는 의미
		System.out.printf("문자 %c의 유니코드는 %d\n",'A',(int)'A');
		System.out.printf("문자 %c의 유니코드는 %d\n",'a',(int)'a');
		System.out.printf("문자 %c의 유니코드는 %d\n",'0',(int)'0');
		System.out.printf("문자 %c의 유니코드는 %d\n",'A'+1,(int)('A'+1));		
	}
	
}
