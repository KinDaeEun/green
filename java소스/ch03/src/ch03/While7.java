package ch03;

import java.io.IOException;

public class While7 {
	public static void main(String[] args) throws IOException {
		int num = 0, i = 1;
		while(true) {
			System.out.println("보고싶은 구구단 번호 ?");
			num = System.in.read() - '0';
			System.in.read();
			System.in.read();
			if (num >= 2 && num <= 9)
				while (i<=9){
					System.out.println(num + " * " + i + " = " + num * i);
					i++;
				}
			else if(num==0)
				break ;
			else
				System.out.println("구구단 숫자가 아닙니다");
			i =1;
		} 
		System.out.println("프로그램 종료");
	}
}