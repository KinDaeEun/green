package ch17;

import java.util.*;

public class Ex01 {
	private static CustomerServiceImpl cs = new CustomerServiceImpl();
	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			help();
			String command = sc.nextLine();
			if (command.equals("1"))
				insert();
			else if (command.equals("2"))
				update();
			else if (command.equals("3"))
				select();
			else if (command.equals("4"))
				delete();
			else if (command.equals("5"))
				list();
			else if (command.equals("6"))
				break;
		}
		sc.close();
		System.out.println("프로그램 종료");
	}

	private static void list() {
		List<Customer> list = cs.list();
		if (list == null || list.size() == 0)
			System.out.println("데이터가 없습니다");
		else {
			for (Customer customer : list) {
				System.out.println(customer);
			}
		}

	}

//	private static void delete() {
//		System.out.println("삭제할 id를 입력하세요");
//		String id = sc.nextLine();
//		System.err.println("비밀번호 입력하세요");
//		String pass = sc.nextLine();
//		int result = cs.delete(id,pass);
//		if (result > 0)
//			System.out.println("삭제 되었습니다");
//		else
//			System.out.println("삭제 실패되었습니다");
//
//	}
	private static void delete() {
		System.out.println("삭제할 id를 입력하세요");
		String id = sc.nextLine();
		Customer customer = cs.select(id);
		int result = 0;
		if (customer == null) {
			System.out.println("없는 계정입니다");
		} else if (customer != null) {
			System.out.println("암호를 입력하세요");
			String pass = sc.nextLine();
			result = cs.delete(id, pass);
		}
		if (result > 0)
			System.out.println("삭제 되었습니다");
		else
			System.out.println("삭제 실패되었스빈다");

	}
	//암호 확인 추가
	private static void update() {
		System.out.println("수정할 id를 입력하세요");
		String id = sc.nextLine();
		Customer customer1 = cs.select(id); //id 있는지 체크
		if (customer1 == null) { //id 없는 경우
			System.out.println("없는 계정입니다");
		} else { //id 있는경우
			System.out.println("암호를 입력하세요");
			String pass = sc.nextLine();
			int resultPass = cs.checkPass(id, pass); //암호 맞는지 체크
			if (resultPass > 0) { //암호 맞는 경우
				System.out.println("새 암호를 입력해주세요:");
				String newPass = sc.nextLine();
				System.out.println("암호확인을 입력해주세요:");
				String confiremPass = sc.nextLine();
				System.out.println("새 이름을 입력해주세요:");
				String name = sc.nextLine();
				System.out.println("새 이메일을 입력해주세요:");
				String email = sc.nextLine();
				if (!newPass.equals(confiremPass)) { //새 암호와 암호 확인 다른 경우
					System.out.println("암호와 암호확인 다릅니다");
					return;
				}
				Customer customer2 = new Customer(id, newPass, name, email);
				int result = cs.update(customer2);
				if (result > 0)
					System.out.println("수정 성공");
				else
					System.out.println("수정 실패");
			} 
		}

	}
	//암호 확인 추가
	private static void select() {
		System.out.println("조회할 id를 입력하세요");
		String id = sc.nextLine();
		Customer customer = cs.select(id); //id있는지 체크
		if(customer != null) { //id 존재
			System.out.println("암호를 입력하세요");
			String pass = sc.nextLine();
			int result = cs.checkPass(id, pass); //암호 맞는지 체크
			if(result>0) { //암호 맞는 경우
				System.out.println(customer);
			}else //암호 틀린 경우
				System.out.println("암호 틀렸습니다");
		}else //id 없는 경우
			System.out.println("없는 계정입니다");

	}

	private static void insert() {
		System.out.println("id를 입력해주세요:");
		String id = sc.nextLine();
		System.out.println("암호를 입력해주세요:");
		String pass = sc.nextLine();
		System.out.println("암호확인을 입력해주세요:");
		String confiremPass = sc.nextLine();
		System.out.println("이름을 입력해주세요:");
		String name = sc.nextLine();
		System.out.println("이메일을 입력해주세요:");
		String email = sc.nextLine();

		if (!pass.equals(confiremPass)) {
			System.out.println("암호와 암호확인 다릅니다");
			return;
		}
		Customer customer = new Customer(id, pass, name, email);

		int result = cs.insert(customer);
		if (result > 0) {
			System.out.println("입력되었습니다");
		} else
			System.out.println("입력실패되었습니다");

	}

	private static void help() {
		System.out.println("다음 명령어 중에서 선택하시요");
		System.out.println("1,입력");
		System.out.println("2,수정");
		System.out.println("3,조회");
		System.out.println("4,삭제");
		System.out.println("5,목록");
		System.out.println("6,종료");
		System.out.println("명령번호: ");

	}

}
