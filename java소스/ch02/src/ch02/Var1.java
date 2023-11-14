package ch02;
public class Var1 {
	public static void main(String[] args) {
		int i1;  // 변수 선언 메모리 정수 4byte를 저장할 공간을 확보
		i1 = 15; // 변수에 i1에 값 15대입 자바에서는 =은 대입
		i1 = 25; // 숫자는 그냥 사용
		System.out.println("i1 = "+i1); // 문자열은 큰 따움표("")를 붙여서 사용
		int i2 = 77; // 변수 선언과 대입를 동시에
		System.out.println("i2 = "+i2);
		System.out.println(0.1 + 0.2);
	}
}