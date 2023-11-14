package ch15;
import java.util.*;
import java.util.stream.Collectors;
import ch15.Student2.Gender;
public class PipedSt2Ex2 {
	public static void main(String[] args) {
		List<Student2> list = Arrays.asList(
				new Student2("로제", 88, Gender.FEMALE),
				new Student2("보검", 77, Gender.MALE),
				new Student2("제니", 99, Gender.FEMALE),
				new Student2("은우", 66, Gender.MALE) );
		double avg = list.stream().mapToInt(Student2::getScore)
				.average().getAsDouble();
		System.out.println("평균 점수 : "+avg);
		avg = list.stream()
			.filter(s->s.getGender()==Student2.Gender.MALE)
			.mapToInt(Student2::getScore)
			.average().getAsDouble();
		System.out.println("남자평균 점수 : "+avg);
		avg = list.stream()
				.filter(s->s.getGender()==Student2.Gender.FEMALE)
				.mapToInt(Student2::getScore)
				.average().getAsDouble();
		System.out.println("여자평균 점수 : "+avg);
	}
}