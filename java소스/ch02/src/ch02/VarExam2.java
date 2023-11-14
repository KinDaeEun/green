package ch02;

public class VarExam2 {

	public static void main(String[] args) {
		
		int i1 = 15;
		if (i1 > 10) { // i1이 10보다 크면
			int i2 = i1 - 10;	//중괄호({}) 안에서만 i2를 사용 가능
			System.out.println("i2 = "+ i2);
		}
//		int i3 = i1 + i2; // i2가 범위를 벗어나서 사용하기 때문에 에러,
	}
	
}
