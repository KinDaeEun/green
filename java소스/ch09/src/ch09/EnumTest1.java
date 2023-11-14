package ch09;

public class EnumTest1 {
	public static void main(String[] args) {
		Student1 st1 = new Student1(SchoolType.ELEMENTARY);
		Student1 st2 = new Student1(SchoolType.HIGH);
		System.out.println("school type: "+st1.school);
		if(st1.school == SchoolType.ELEMENTARY) {
			System.out.println("초딩이둔");
		}
		if(st2.school == SchoolType.HIGH) {
			System.out.println("고딩이둔");
		}
		SchoolType[] schools = SchoolType.values();
		for(SchoolType school:schools) {
			//                  값             인덱스 번호 
			System.out.println(school+" : "+school.ordinal());
		}
	}
}
