package ch11;
public class Orange {
	int sugarContent;  // 당분 함량
	public Orange(int sugarContent) {
		this.sugarContent = sugarContent;
	}
	void showSugar() {
		System.out.println("당도 : "+sugarContent);
	}
}

class Apple {
	int weight;
	public Apple(int weight) {
		this.weight = weight;
	}
	void showWeight() {
		System.out.println("무게 : "+weight);
	}
}