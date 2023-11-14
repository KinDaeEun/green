package ch03;

public class If7 {
	public static void main(String[] args) {
		int money = Integer.parseInt(args[0]);
		if (money >= 1000000)
			System.out.println("비행기");
		else if (money >= 200000)
			System.out.println("KTX");
		else if (money >= 100000)
			System.out.println("택시");
		else if (money >= 10000)
			System.out.println("버스");
		else
			System.out.println("걸어가");

	}
}
