package ch06;

class Score1 {
	private String name;
	private int kor, eng, math;
	

	public void setInfo(String name, int kor, int eng, int math) {
		if (kor < 0 || eng < 0 || math < 0) {
			System.out.println(name + "의 성적을 정확히 입력해주서요");
		} else {
			this.name = name;
			this.kor = kor;
			this.eng = eng;
			this.math = math;
			System.out.printf("%s의 성적\n 국어: %d\t 영어: %d\t 수학: %d\n 총점은%d\n", name, kor, eng, math, kor + eng + math);
		}
	}

}

public class Score1Ex {
	public static void main(String[] args) {
		Score1 st1 = new Score1();
		st1.setInfo("하은", -90, 70, 80);

		Score1 st2 = new Score1();
		st2.setInfo("성재", 40, 50, 60);
	}
}
