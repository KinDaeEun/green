package customer;

import java.util.*;

public class Ex01 {
	private static CustomerServiceImpl cs = new CustomerServiceImpl();
	private static Scanner sc;

	public static void main(String[] args) {
		sc = new Scanner(System.in);

		while (true) {
			help();
			String command = sc.nextLine();
			if (command.equals("6"))
				break;
			else if (command.equals("1"))
				insert();
			else if (command.equals("2"))
				update();
			else if (command.equals("3"))
				select();
			else if (command.equals("4"))
				delete();
			else if(command.equals("5"))
				list();
		}
		sc.close();
		System.out.println("프로그램 종료");
	}

	private static void list() {
		List<Customer> list = cs.list();
		if(list == null || list.size()==0)
			System.out.println("데이터가 없습니다");
		else
			for(Customer customer:list) {
				System.out.println(customer);
			}
	}

	private static void delete() {
		System.out.println("삭제할 id를 입력하세요");
		String id = sc.nextLine();
		int result = cs.delete(id);
		if(result > 0)
			System.out.println("삭제 되었습나다");
		else
			System.out.println("없는 id입니다");
		
	}

	private static void update() {
		System.out.println("수정할 id는 무엇인가요");
		String id = sc.nextLine();
		System.out.println("이메일을 어떤 것으로 변경할까요");
		String email = sc.nextLine();
		System.out.println("이름을 어떤 것으로 변경할까요");
		String name = sc.nextLine();
		System.out.println("암호를 입력하세요");
		String pass = sc.nextLine();
		System.out.println("암호확인를 입력하세요");
		String confiremPass = sc.nextLine();
		Customer customer = new Customer(id, confiremPass, email, name);
		if (!pass.equals(confiremPass)) {
			System.out.println("암호와 암호 확인이 다릅니다");
			return;
		}
		int result = cs.update(customer);
		if (result > 0)
			System.out.println("수정 되었습니다");
		else
			System.out.println("에휴 !! 수정실패");

	}

	private static void select() {
		System.out.println("조회할 id를 입력하세요");
		String id = sc.nextLine();
		Customer customer = cs.select(id);
		if (customer == null)
			System.out.println("없는 데이터 입니다");
		else
			System.out.println(customer);

	}

	private static void insert() {
		System.out.println("id를 입력하세요");
		String id = sc.nextLine();
		System.out.println("이메일을 입력하세요");
		String email = sc.nextLine();
		System.out.println("이름을 입력하세요");
		String name = sc.nextLine();
		System.out.println("암호를 입력하세요");
		String pass = sc.nextLine();
		System.out.println("암호확인를 입력하세요");
		String confiremPass = sc.nextLine();
		Customer customer = new Customer(id, confiremPass, email, name);
		if (!pass.equals(confiremPass)) {
			System.out.println("암호와 암호 확인이 다릅니다");
			return;
		}
		int result = cs.insert(customer);
		if (result > 0)
			System.out.println("대박 입력됐네");
		else
			System.out.println("에휴 !! 입력실패");

	}

	private static void help() {
		System.out.println("다음 명령어 중에서 선택하시요");
		System.out.println("1. 입력");
		System.out.println("2. 수정");
		System.out.println("3. 조회");
		System.out.println("4. 삭제");
		System.out.println("5. 목록");
		System.out.println("6. 종료");
		System.out.println("명령번호: ");

	}
}
