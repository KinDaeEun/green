package ch10;

public class Except1Ex {
	public static void main(String[] args) {

		int number = 100;
		for(int i = 0;i<10;i++) {
			int ran = (int)(Math.random()*10);

			//문장을 실행하다가 문제가 없으면 그냥 실행하고 문제가 발생하면
			try {
				System.out.printf("%d / %d = %d\n",number,ran,number/ran);
			//문제가 있는 부분을 잡아서 처리해 줄게
			}catch(ArithmeticException e) {
				
				System.out.println("0으로 못나눠");
			}
		}

	}
}
