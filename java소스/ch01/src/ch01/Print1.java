package ch01;

public class Print1 {

	public static void main(String[] args) {
//		이름 : 를 출력하고 줄이 안바뀜		
		System.out.print("이름 : ");
//		제니라고 출력하고 줄바뀜 ln운 line의 약자
		System.out.println("제니");
//		f는 format(형식)의 약자 %s는 문자열이고 %d는 정수
//		줄 안바뀜, \n은 줄바꿈
		System.out.printf("이름 : %s, 나이 : %d\n", "로제", 26);	
		System.out.printf("이름 : %s, 나이 : %d", "로제", 26);	
		System.out.println(4.5-(4.5%1));
		System.out.println(10-(10%1));
		
		System.out.println(2%4);
		System.out.println(0%4);
		System.out.println(2/4);
		System.out.println(0/4);
	}
	
	
	
}
