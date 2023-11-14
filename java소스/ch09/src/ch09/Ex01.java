package ch09;

public class Ex01 {

	public static void main(String[] args) {
		Point3D p1 = new Point3D(1, 2, 3);
		Point3D p2 = new Point3D(1, 2, 3);
		System.out.println(p1);
		System.out.println(p2);
		System.out.println("p1==p2?" + (p1 == p2));
		System.out.println("p1.equals(p2)?" + (p1.equals(p2)));
		System.out.println(p1);
		System.out.println(p2);
	}
}
class Point3D {
	int x, y, z;

	Point3D(int x, int y, int z) {
		this.x = x;
		this.y = y;
		this.z = z;
	}

	Point3D() {
		this(0, 0, 0);
	}
	//두개의 객체가 같다느느 조선을 정의
//	public boolean equals(Object obj) {
//		Point3D p = (Point3D) obj;
//		return x == p.x && y == p.y && z == p.z;
//	}
	public boolean equals(Point3D obj) {
		
		return x == obj.x && y == obj.y && z == obj.z;
	}
	//객체를 출력할 때 문자열로 출력하는 형식: 안하면 패키지명.클래스명@해시코드
	public String toString() {
		return "[" + x + "," + y + "," + z + "]";
	}

}
