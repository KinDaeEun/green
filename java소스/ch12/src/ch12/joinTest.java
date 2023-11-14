package ch12;

import java.util.ArrayList;

public class joinTest {

	public static ArrayList<String> carList = new ArrayList<>();
	
	public static void main(String[] args) throws InterruptedException {
		BeforeThread bt = new BeforeThread("before");
		AfterThread at = new AfterThread("after");
		bt.start();
		bt.join(); //bt 작업이 종료한 후에 다음 작업 진행
		at.start();

	}

}
