package ch10;

import java.io.IOException;

public class Throws2 {
	//try ~ catch 또는 throws로 예외처리 해야 한다
	//try ~ catch 예외처리
	//throws 요청한 곳으로 예외를 처리해 달라고 전진다
	public static void main(String[] args) {
		System.out.println("정수를 입력하세요");
		try {
			int num = System.in.read();
			System.out.println("입력한 정수: "+ num);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
