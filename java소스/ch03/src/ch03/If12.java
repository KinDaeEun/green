package ch03;

public class If12 {
	public static void main(String[] args) {
		int value = Integer.parseInt(args[0]);
		if (value < 10)
			System.out.println("입력한 값은 " + value + "이고 10미만입니다");
		else if (value < 100)
			System.out.println("입력한 값은 " + value + "이고 10이상 100미만입니다");
		else if (value < 1000)
			System.out.println("입력한 값은 " + value + "이고 100이상 1000미만입니다");
		else
			System.out.println("입력한 값은 " + value + "이고 1000 이상의 값입니다");

	}
}
