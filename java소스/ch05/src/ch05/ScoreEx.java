package ch05;

class Score {
	String name = "무명"; // 멤버변수, 전역변수
	int kor  = 60;
	int eng = 60;
	int math = 60;

	void scoreCal() {
		System.out.println("이름\t국어\t영어\t수학\t합계\t평균");
		int sum = kor + eng + math; //지역 변수
		System.out.print(name + "\t" + kor + "\t" + eng + "\t" + math + "\t");
		System.out.println(sum + "\t" + sum / 3);
	}

}

public class ScoreEx {
	public static void main(String[] args) {
		Score sc1 = new Score();
		sc1.name = "로제";
		sc1.eng = 88;
		sc1.math = 90;
		sc1.scoreCal();
		
		Score sc2 = new Score();
		sc2.name = "보검";
		sc2.kor = 77;
		sc2.math = 30;
		sc2.scoreCal();
		
		Score sc3 = new Score();
		sc3.kor = 77;
		sc3.math = 30;
		sc3.scoreCal();
	}
}
