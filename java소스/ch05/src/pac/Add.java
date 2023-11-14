package pac;

public class Add {
	//public 모두 사용 가능
	//public 이 없으면 default는 같은 클래스나 같은 패키지 내에서 사용가능
	public  int x = 10;
	public int y = 10;

	public void add() {
		System.out.printf("%d + %d = %d\n", x, y, x + y);
	}
}

