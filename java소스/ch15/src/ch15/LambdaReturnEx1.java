package ch15;
@FunctionalInterface
interface MyInter3{
	int add(int x, int y);
}
public class LambdaReturnEx1 {
	public static void main(String[] args) {
		MyInter3 mi;
		mi = (x,y)->{
			int result = x+y;
			return result;
		};
		System.out.println("결과"+mi.add(12,8));
		
		mi = (x,y) ->{
			return x+y;
		};
		System.out.println("결과"+mi.add(10,5));
		
		mi = (x,y) -> x+y;
		System.out.println("결과"+mi.add(17, 15));
	}
}
