package ch06;

class Student1 {
	String name;
	int kor, eng, math;

	Student1(String name, int kor, int eng, int math) {
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}

	int getTotal() {
		return kor + eng + math;
	}

	float getAverage() {
		float avg = getTotal() / 3.0f;
		return avg;
	}

	void prn() {
		System.out.println("==============");
		System.out.println("이름: " + name);
		System.out.println("총점: " + getTotal());
		System.out.println("평균: " + getAverage());
	}
}

public class Student1Ex {
	public static void main(String[] args) {
		Student1 st1 = new Student1("하니", 78, 88, 98);
		Student1 st2 = new Student1("정우", 68, 55, 78);
		Student1 st3 = new Student1("로제", 66, 99, 88);
		st1.prn();
		st2.prn();
		st3.prn();
	}
}
