package ch02;

public class Ex01 {
	public static void main(String[] args) {
		int numOfApples = 123;
		int sizeOfBucket = 10;
		int i = numOfApples / sizeOfBucket;
		int numOfBucket = (numOfApples % sizeOfBucket == 0) ? i : i + 1;
		System.out.println(numOfBucket);
	}
}
