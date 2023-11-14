package ch02;

public class print2 {

	public static void main(String[] args) {
//		블랙핑크 한글자마다 출력 후에 탭키 문장 끝에 줄바꿈
		System.out.println("블\t랙\t핑\t크");
		System.out.println("-------------------------------");
//		블랙 출력하고 줄바꿈하고 핑크 \r, \n, r\n 각각 사용후에 핑크

		System.out.println("블랙\r핑크");
		System.out.println("블랙\n핑크");
		System.out.println("블랙\r\n핑크");

		
	}
	
}
