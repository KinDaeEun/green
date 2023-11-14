package ch07;
// Generics을 사용 하는 클래스를 만들기 위해서는 <>안데 대문자 1자
class GeneT<T>{
	T[] v;
	void set(T[] v) {
		this.v = v;
	}
	void prn() {
		for(T s:v) {
			System.out.println(s);
		}
	}
}
public class GeneEx1 {
	public static void main(String[] args) {
		GeneT<String> gt = new GeneT<>();
		String[]ss = {"대박","사건","뭥미"};
		gt.set(ss);
		gt.prn();
		System.out.println("============");
		GeneT<Integer> gt2 = new GeneT<>();
		Integer[] li = {12,67,55,88};
		gt2.set(li);
		gt2.prn();
	}
}
