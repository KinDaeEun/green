package ch02;

public class Mono1 {
	public static void main(String[] args) {
		int i1 = 5, i2 = 5;
//		++는 1증가 변수앞에 ++는 증가를 먼저하고 식을 실행
//		변수 뒤에 ++는 식을 실행 한 후에 값을 1증가 
		System.out.println("i1 = "+ i1++ +", i2 = "+ ++i2);
		System.out.println("i1 = "+ i1 +", i2 = "+ i2);
		int i3 = 10, i4 = 10;
//		--는 1감소 변수 앞에 --는 1감소를 먼저하고 식을 실행
//		변수 뒤에 --는 식을 실행 한 후에 값을 1감소
		System.out.println("i3 = "+ i3-- +", i4 = "+ --i4);
		System.out.println("i3 = "+ i3 +", i4 = "+ i4);
	}
}
