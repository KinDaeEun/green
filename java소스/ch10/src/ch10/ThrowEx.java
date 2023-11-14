package ch10;

public class ThrowEx {
	public static void main(String[] args) {
		try {
			System.out.println("허걱");
			//개발자가 현 위치에서 에러를 강제로 발생 시킬 때 사용
			//테스트하고 싶을 때 사용
			throw new Exception("대박사건");

		}catch(Exception e) {
			System.out.println(e.getMessage());
		}


	}
}
