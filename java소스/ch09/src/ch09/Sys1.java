package ch09;

public class Sys1 {
	public static void main(String[] args) {
		//시스템에 설정된 정보 읽기
		String path= System.getenv("path");
		String java_home= System.getenv("JAVA_HOME");
		System.out.println("path : "+path);
		System.out.println("home : "+java_home);
	}
}
