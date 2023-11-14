package ch12;

import java.util.ArrayList;

public class AfterThread extends Thread{
	public AfterThread(String title) {
		super(title);
	}
	public void run() {
		System.out.println(getName()+"실행");
		ArrayList<String> carList = joinTest.carList;
		for(String car: carList) {
			System.out.println(car);
		}
	}
}
