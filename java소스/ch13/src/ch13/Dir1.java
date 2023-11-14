package ch13;

import java.io.File;

public class Dir1 {
	public static void main(String[] args) {
		// .:현재 directory(폴더), ..:상위 디렉토리(폴더,패키지)
//		File dir = new File(".");
//		File dir = new File("./src/ch13");
//		File dir = new File("../ch12/src/ch12");
		File dir = new File("C:\\java\\javaSrc\\ch06\\src\\ch06");
		String[] strs = dir.list();
		for (String str : strs) {
			System.out.println(str);
		}
	}
}
