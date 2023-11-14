package ch07;

public class Engine {
	private int displacement;
	private String type;
	
	Engine(int displacement, String type){
		this.displacement = displacement;
		this.type =type;
	}
	
	void print() {
		System.out.println("============");
		System.out.println("배기량: " + displacement);
		System.out.println("엔진타입: " + type);
	}
	
	
}
