package ch13;
import java.io.*;
import java.util.GregorianCalendar;
public class ObjectOut1 {
	public static void main(String[] args) throws FileNotFoundException, IOException {
		ObjectOutputStream oos = new ObjectOutputStream(
				new FileOutputStream("data.txt"));
		oos.writeObject(new GregorianCalendar(2023,5,15));
		oos.writeObject(new GregorianCalendar(2023,5,16));
		oos.writeObject(new GregorianCalendar(2023,5,17));
		oos.close();
		System.out.println("직열화 완료");
	}
}