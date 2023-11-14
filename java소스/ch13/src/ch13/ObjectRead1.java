package ch13;
import java.io.*;
import java.util.GregorianCalendar;
public class ObjectRead1 {
	public static void main(String[] args) throws IOException {
		ObjectInputStream ois = null;
		try {
			ois = new ObjectInputStream(
					new FileInputStream("data.txt"));
			while(true) {
				GregorianCalendar gc = 
						(GregorianCalendar)ois.readObject();
				System.out.printf("%TF\n", gc);
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			ois.close();
		}		
	}
}