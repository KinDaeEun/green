package ch11;
class FruitBox1 {
	Object item;
	void store(Object item) {
		this.item = item;
	}
	Object pullOut() {
		return item;
	}
}

public class FruitBox1Ex {
	public static void main(String[] args) {
		FruitBox1 fb = new FruitBox1();
		fb.store(new Orange(10));
		Orange og1 = (Orange)fb.pullOut();
		og1.showSugar();
//	프로그램 작성후에 컴파일 할 때는 에러가 없지만 실행할 때 에러가 발생	
		fb.store(new Apple(8));
//	사과를 Orange로 형 변활 할 수 없으므로 에러	
		Orange og2 = (Orange)fb.pullOut();
		og2.showSugar();
	}
}