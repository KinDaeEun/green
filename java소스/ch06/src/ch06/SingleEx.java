package ch06;
class Singleton{ //design pattern
	//static 이 있는 instance 객체는 클래스가 loading될 때 1회 실행
	static Singleton instance = new Singleton();
	//생성자 앞에 private이 있으므로 다른 class에서 직접 캑체 생성 못함
	Singleton() {}
	//loading될 때 생성된 instance를 사용하면 객체 생성 기능
	//getInstance() 메서드를 통하여 사용
	public static Singleton getInstance() {
		return instance;
	}
}
public class SingleEx {
	public static void main(String[] args) {
		//참조변수명은 s1/s2/s3로 각각 다르지만 주소가 같다
		Singleton s1 = Singleton.getInstance();
		Singleton s2 = Singleton.getInstance();
		Singleton s3 = Singleton.getInstance();
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		if(s1 == s2)
			System.out.println("같다");
		else
			System.out.println("다르다");
		
		
		Singleton t1 = new Singleton();
		Singleton t2 = new Singleton();
		Singleton t3 = new Singleton();
		System.out.println(t1);
		System.out.println(t2);
		System.out.println(t3);
		if(t1 == t2)
			System.out.println("같다");
		else
			System.out.println("다르다");
	}
}
