package ch02;

public class Spec1 {

	public static void main(String[] args) {
		System.out.println("대\t박\t사\t건");
		System.out.println("대\t박\n사\t건");
//		\r커서를 맨 앞으로 가라  - 콘솔에서는 줄바꿈, \n 줄바꿈
		System.out.println("대\r박\n사\r건");
		System.out.println("대박\r\n사건"); // \r\n은 엔터
//		\"은 \은 escape문자라고 하고 "는 큰 따옴표 끝이 아니라 문자 "로 그대로 라는 의미
		System.out.println("\"대박\"사건");
//		\\는 \라는 의미
		System.out.println("\\");
		
	}
	
	
}
