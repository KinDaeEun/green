package ch13;
import java.io.*;
import java.util.*;
public class FileReader1 {
	public static void main(String[] args) throws IOException{
		Scanner sc = new Scanner(System.in);
		System.out.println("읽을 파일명을 입력하시요");
		String fileName = sc.nextLine();
		FileReader fr = new FileReader(fileName);
		BufferedReader br = new BufferedReader(fr);
				while(true) {
					String str = br.readLine();
					if(str==null)
						break;
					System.out.println(str);
				}
		fr.close();
		br.close();
		sc.close();
		System.out.println("프로그램 종료");
	}
}
