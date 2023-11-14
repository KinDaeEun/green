package ch09;

public class PersonEx {
	public static void main(String[] args) {
		Person p1 = new Person("1111", "로제", 26);
		Person p2 = new Person("1111", "보검", 31);
		Person p3 = new Person("2222", "로제", 26);
		

		// == 데이터 내용과 주소가 일치할 때만 같다
		if(p1 == p2)
			System.out.println("p1과 p2는 같다");
		else
			System.out.println("p1과 p2는 다르다");
		
		if(p1 == p3)
			System.out.println("p1과 p3는 같다");
		else
			System.out.println("p1과 p3는 다르다");
		System.out.println("=====================");
		if(p1.equals(p2))
			System.out.println("p1과 p2는 같다");
		else
			System.out.println("p1과 p2는 다르다");
		
		if(p1.equals(p3))
			System.out.println("p1과 p3는 같다");
		else
			System.out.println("p1과 p3는 다르다");
		//객체를 출력: 패키지명.클래스명@해시코드
		
		System.out.println("p1 = "+p1);
		System.out.println("p2 = "+p2);
		System.out.println("p3 = "+p3);
	}
}
