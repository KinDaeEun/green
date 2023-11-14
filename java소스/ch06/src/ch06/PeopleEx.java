package ch06;

public class PeopleEx {
	public static void main(String[] args) {
		Stu st1 = new Stu();
		st1.setName("로제");
		st1.setAge(26);
		st1.setBan("1반");
		st1.printAll();

		Teacher th1 = new Teacher();
		th1.setName("은우");
		th1.setAge(28);
		th1.setSubject("자바");
		th1.printAll();

		Teacher th2 = new Teacher();
		th2.setName("제니");
		th2.setAge(27);
		th2.setSubject("데이터베이스");
		th2.printAll();

		Manager mg1 = new Manager();
		mg1.setName("하니");
		mg1.setAge(17);
		mg1.setSubject("춤");
		mg1.printAll();

		Manager mg2 = new Manager();
		mg2.setName("명수");
		mg2.setAge(52);
		mg2.setSubject("화장실청소");
		mg2.printAll();
	}
}
