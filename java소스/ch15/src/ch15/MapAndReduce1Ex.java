package ch15;

import java.util.Arrays;
import java.util.List;

public class MapAndReduce1Ex {
	public static void main(String[] args) {
		List<Student1> list = Arrays.asList(new Student1("로제", 26),
				new Student1("보검", 29),new Student1("제니", 25));
		double avg = list.stream().mapToInt(Student1::getAge).average().getAsDouble();
		System.out.printf("평균 나이: %.2f",avg);
	}
}
