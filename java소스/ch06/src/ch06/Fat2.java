 package ch06;

import java.util.Scanner;

public class Fat2 {
	static int fat(int num) { //recursive (반복) 함수
		if (num == 1)
			return 1;
		else
			return num * fat(--num);

	}

	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = 0;
		do {
			System.out.println("계승값을 입력하세요");
			num = sc.nextInt();
			if (num != 0)
				System.out.println(fat(num));
		} while (num != 0);

		sc.close();
	}

}