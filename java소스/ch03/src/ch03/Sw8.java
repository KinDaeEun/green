package ch03;

public class Sw8 {
	public static void main(String[] args) {
		int salary = Integer.parseInt(args[0]);
		String grade = "";
		switch (salary / 1000) {
		case 0:
		case 1:
			grade = "A";
			break;
		case 2:
		case 3:
			grade = "B";
			break;
		case 4:
			grade = "C";
			break;
		default:
			grade = "D";

		}
		System.out.printf("급여 %d는 %s등급입니다", salary, grade);
	}
}
