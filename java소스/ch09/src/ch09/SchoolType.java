package ch09;

public enum SchoolType {
	ELEMENTARY,MIDDLE,HIGH,UNIVERSITY
}
class Student1{
	SchoolType school;
	public Student1(SchoolType school) {
		this.school = school;
	}
}
