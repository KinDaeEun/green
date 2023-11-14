package ch08;
interface G{
	void m1();
}
//G1과 G2, G1과 G3관계 느슨해 졌다
//좋은 시스템은 결합도가 느슨한 시스템 (loosely coupled)
class G1 {
	static void m1(G g) { // 포함관계
		g.m1();
	}
}

class G2 implements G{
	public void m1() {
		System.out.println("대박");
	}
}

class G3 implements G{
	public void m1() {
		System.out.println("쪽박");
	}
}

public class InterTest2 {
	public static void main(String[] args) {
//		G2 g = new G2();
		G3 g = new G3();
		G1 g1 = new G1();
		g1.m1(g);

	}
}
