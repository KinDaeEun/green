package ch04;

public class Arr2 {
	public static void main(String[] args) {
		int[] i1 = new int[5];
		i1[0] = 13;
		i1[1] = 14;
		i1[2] = 12;
		i1[3] = 15;
		i1[4] = 17;
		System.out.println("데이터 갯수: " + i1.length);
		for (int i = 0; i < i1.length; i++) {
			System.out.println("i1[" + i + "] = " + i1[i]);
		}
		System.out.println("============");
		// 확장 for 배열 i1에 들어있는 데이터를 하나씩 i로 이동하여 출력
		// 데이터 없을 때 까지
		for (int i : i1) {
			System.out.println(i);
		}
	}
}
