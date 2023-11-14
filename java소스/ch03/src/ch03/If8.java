package ch03;

public class If8 {
	public static void main(String[] args) {
		int score = 95;
		String grade = "";
		if (score >= 90) {
			grade = "A";
			if (score > 95)
				grade += "+";
			else
				grade += "0";
		} else if (score >= 80) {
			grade = "B";
			if (score > 85)
				grade += "+";
			else
				grade += "0";
		} else if (score >= 70) {
			grade = "C";
			if (score > 75)
				grade += "+";
			else
				grade += "0";
		} else if (score >= 60) {
			grade = "D";
			if (score > 65)
				grade += "+";
			else
				grade += "0";
		} else
			grade = "F";
		System.out.println("점수는 " + score + "이고, 학점은 " + grade + "입니다");
	}
}
