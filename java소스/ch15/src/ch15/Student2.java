package ch15;

public class Student2 {
	enum Gender {MALE,FEMALE};
	enum City {SEOUL,PUSAN};
	private String name;
	private int score;
	private Gender gender;
	private City city;
	public Student2(String name, int score, Gender gender){
		this.name = name;
		this.score = score;
		this.gender = gender;
	}
	public Student2(String name, int score, Gender gender,City city) {
		this.name = name;
		this.score = score;
		this.gender = gender;
		this.city = city;
	}
	public String getName() {
		return name;
	}
	public int getScore() {
		return score;
	}
	public Gender getGender() {
		return gender;
	}
	public City getCity() {
		return city;
	}
	
}
