package ch06;
class Student2{
	Student2(){
		System.out.println("매개변수 없다");
	}
	Student2(String name){
		this();
		System.out.println("매개변수 1개"+name );
	}
	Student2(String name,int kor){
		this(name);
		System.out.println("매개변수 2개"+name+" "+kor);
	}
	Student2(String name,int kor,int eng ){
		this(name,kor);
		System.out.println("매개변수 3개"+name+" "+kor+" "+eng);
	}
	
	
	
}
public class Student2Ex {
	public static void main(String[] args) {
		Student2 st = new Student2("차은우",50,60);
	}
}
