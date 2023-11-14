package ch11;
class FruitBox2<T> {
	T item;
	void store(T item) {
		this.item = item;
	}
	T pullOut() {
		return item;
	}
}

public class FruitBox2Ex {
	public static void main(String[] args) {
		FruitBox2<Orange> fb = new FruitBox2<>();
		fb.store(new Orange(10));
		Orange og1 = (Orange)fb.pullOut();
		og1.showSugar();
//	Generic을 사용하면 프로그램 작성 할 때 에러 체크해 준다 	
//		fb.store(new Apple(8));
//	사과를 Orange로 형 변활 할 수 없으므로 에러	
//		Orange og2 = (Orange)fb.pullOut();
//		og2.showSugar();
	}
}