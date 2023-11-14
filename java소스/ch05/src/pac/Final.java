package pac;
public class Final {
	public static void main(String[] args) {
		final float PI = 3.14f; // final 마지막
//		pi = 3.141592f;                  변경금지
		int r = 10;
		r = 20;
		System.out.println("반지름이 "+r+"인 원의 면적 : "
				+ PI * r * r);
	}
}