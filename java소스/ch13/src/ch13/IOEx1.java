package ch13;

import java.io.*;
import java.util.Arrays;

public class IOEx1 {
	public static void main(String[] args) throws IOException {
		byte[] inSrc = {0,1,2,3,4,5,6,7,8,9};
		byte[] outSrc = null;
		ByteArrayInputStream input = null;
		ByteArrayOutputStream output = null;
		input = new ByteArrayInputStream(inSrc);
		output = new ByteArrayOutputStream();
		
		int data = 0;
		//-1은 더이상 읽을 데이터가 없음
		while((data = input.read())!=-1) { //한글자씩 읽어서 data에 대입
			output.write(data); //data에 대입된 데이터를 output을 내보냄
		}
		outSrc = output.toByteArray();//output에 있는 데이터를 byte단위로 outSrc에 옮김
		System.out.println(Arrays.toString(inSrc));
		System.out.println(Arrays.toString(outSrc));
		input.close();
		output.close();
	}
}
