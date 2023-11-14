package ch07;

public class Car {
	private String kind;
	private int inwon;

	

	public String getKind() {
		return kind;
	}

	public void setKind(String kind) {
		this.kind = kind;
	}

	public int getInwon() {
		return inwon;
	}

	public void setInwon(int inwon) {
		this.inwon = inwon;
	}
	void print() {
		System.out.println("=================");
		System.out.println("차 종류: "+kind);
		System.out.println("승차 인원: "+inwon);
	}
}
