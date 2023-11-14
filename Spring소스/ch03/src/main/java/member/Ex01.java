package member;

import java.util.Scanner;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class Ex01 {
	private static MemberService ms;
	private static Scanner sc;

	public static void main(String[] args) {
		AbstractApplicationContext ac = new GenericXmlApplicationContext("db.xml");
		ms = ac.getBean(MemberService.class);
		sc = new Scanner(System.in);
		String command = "";
		while (true) {
			help();
			command = sc.nextLine();
			if (command.equals("6")) {
				break;
			} else if (command.equals("1")) {
				insert();
			} else if (command.equals("2")) {
				update();
			} else if (command.equals("4")) {
				select();
			} else if (command.equals("5")) {
				list();
			} else if (command.equals("3")) {
				delete();

			}
		}
		sc.close();
		ac.close();
		System.out.println("프로그램 종료");
	}

	private static void delete() {
		System.out.println("삭제할 아이디를 입력하세요");
		String id = sc.nextLine();
		int result = ms.delete(id);
		if(result>0) {
			System.out.println("삭제성공");
		}
		
	}

	private static void list() {
		ms.list();

	}

	private static void update() {
		System.out.println("수정할 아이디 입력");
		String id = sc.nextLine();
		System.out.println("암호 입력");
		String password = sc.nextLine();
		System.out.println("암호확인입력");
		String passConfirm = sc.nextLine();
		if (!password.equals(passConfirm)) {
			System.out.println("암호와 암호확인이 다릅니다");
			return;
		}
		System.out.println("이메일 입력");
		String email = sc.nextLine();
		System.out.println("이름 입력");
		String name = sc.nextLine();

		Member member = new Member();
		member.setId(id);
		member.setEmail(email);
		member.setName(name);
		member.setPassword(password);
		int result = ms.update(member);
		if (result > 0) {
			System.out.println("수정성공ㅋ");
		}

	}

	private static void select() {
		System.out.println("조회할 아이디를 입력하세요");
		String id = sc.nextLine();
		ms.select(id);
		

	}

	private static void insert() {
		System.out.println("아이디 입력");
		String id = sc.nextLine();
		System.out.println("암호 입력");
		String password = sc.nextLine();
		System.out.println("암호확인입력");
		String passConfirm = sc.nextLine();
		if (!password.equals(passConfirm)) {
			System.out.println("암호와 암호확인이 다릅니다");
			return;
		}
		System.out.println("이메일 입력");
		String email = sc.nextLine();
		System.out.println("이름 입력");
		String name = sc.nextLine();
		Member member = new Member();
		member.setId(id);
		member.setEmail(email);
		member.setName(name);
		member.setPassword(password);
		int result = ms.insert(member);
		if (result > 0) {
			System.out.println("입력성공ㅋ");
		}

	}

	private static void help() {
		System.out.println();
		System.out.println("1.입력");
		System.out.println("2.수정");
		System.out.println("3.삭제");
		System.out.println("4.조회");
		System.out.println("5.목록");
		System.out.println("6.종료");

	}
}
