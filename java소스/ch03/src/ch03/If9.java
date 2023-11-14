package ch03;

public class If9 {
	public static void main(String[] args) {
		int score =90;
		String grade = "";
		if (score >= 90)
			grade = "A";
		else if (score >= 80)
			grade = "B";
		else if (score >= 70)
			grade = "C";
		else if (score >= 60)
			grade = "D";
		else
			grade = "F";

		int etc = score % 10;
		System.out.println(etc);
		if (score >= 60)
			if (score == 100 || etc > 5)
				grade += "+";
			else
				grade += "0";
		System.out.println("점수는 " + score + "이고, 학점은 " + grade + "입니다");
	}
}
