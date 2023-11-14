package ch11;

import java.util.Vector;

public class Vector3 {
	public static void main(String[] args) {
		Vector<String> vec = new Vector(5); // 용량(capacity)이 5인 객체 생성
		vec.add("1");
		vec.add("2");
		vec.add("3");
		prn(vec);
		
		vec.trimToSize(); // 데이터가 없는 공간을 삭제, 데이터 크기와 용량이 같아진다
		prn(vec);

		vec.ensureCapacity(6); // 데이터를 저장할 용량을 6으로 해라
		prn(vec);

		vec.setSize(7); // 데이터를 7개로 늘려라. 데이터가 없는 곳은 숫자는 0, 문자는 null로 채운다
		prn(vec);       // 용량을 초과해서 데이터가 늘여나면 현재의 용량을 두배로 늘린다 
		
		vec.clear(); //모든 데이터 삭제
		prn(vec);

	}

	private static void prn(Vector<String> vec) {
		System.out.println(vec);
		System.out.println("갯수: " + vec.size());
		System.out.println("용량: " + vec.capacity());

	}
}
