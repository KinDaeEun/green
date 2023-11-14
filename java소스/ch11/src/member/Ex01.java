package member;

import java.util.*;

//콘솔창(웹)으로 명령을 전달받고 결과를 콘솔창으로 알려준다
public class Ex01 {
	public static CustomerServiceImpl cs = new CustomerServiceImpl();

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		help();
		while (true) {
			System.out.println("명령어 입력해주세요");
			String command = sc.nextLine();
			if (command.equals("x"))
				break;
			else if (command.startsWith("insert"))
				insert(command.split(","));
			else if(command.startsWith("select"))
				select(command.split(","));
			else if(command.startsWith("update"))
				update(command.split(","));
			else if(command.startsWith("delete"))
				delete(command.split(","));
			else if(command.equals("list"))
				list();
		}
		sc.close();
		System.out.println("프로그램 종료");
	}

	private static void list() {
		Collection<Customer> list = cs.list();
		if(list == null || list.size() == 0) {
			System.out.println("데이터가 없습니다");
		}else
			for(Customer customer: list) {
				System.out.println(customer);
			}
			
		
	}

	private static void delete(String[] str) {
		if(str.length != 2) {
			help();
			return;
		}
		int result = cs.delete(str[1]);
		if(result >0) 
			System.out.println("삭제 되었습니다");
		else
			System.out.println("없는 계정입니다");
		
		
	}

	private static void update(String[] str) {
		if(str.length != 6) {
			help();
			return;
		}
		if(!str[2].equals(str[3])) {
			System.out.println("암호와 암호확인이 다릅니다");
			return;
		}
		Customer customer = new Customer(str[1],str[2],str[4],str[5],new Date());
		int result = cs.update(customer);
		if(result>0)
			System.out.println("수정 되었습니다");
		else
			System.out.println("없는 계정입니다");
		
	}

	private static void select(String[] str) {
		if(str.length != 2) {
			help();
			return;
		}
		Customer customer = cs.select(str[1]);
		if(customer == null)
			System.out.println("없는 고객입니다");
		else
			System.out.println(customer);
			
	}

	private static void insert(String[] str) {
		if (str.length != 6) {
			help();
			return;
		}
		if(! str[2].equals(str[3])) {
			System.out.println("암호와 암호확인이 다릅니다");
			return;
		}
		Customer customer = new Customer(str[1],str[2],str[4],str[5],new Date());
		int result = cs.insert(customer);
		if(result>0)
			System.out.println("입력성공");
		else
			System.out.println("입력실패");
	}

	private static void help() {
		System.out.println("다음 명령어에서 선택하여 입력하세요");
		System.out.println("insert,id,암호,암호확인,이메일,이름");
		System.out.println("update,id,암호,암호확인,이메일,이름");
		System.out.println("delete, id");
		System.out.println("select, id");
		System.out.println("list");
		System.out.println("x");

	}

//	private static CustomerServiceImpl cs = new CustomerServiceImpl();
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		help();
//		while(true) {
//			System.out.println("명령어를 입력하세요");
//			String command = sc.nextLine();
//			if(command.equals("x"))
//				break;
//			else if(command.startsWith("insert"))
//				insert(command.split(",")); //,를 기준으로 배열로 변경하여 매개변수로 전잘
//			else if(command.startsWith("select"))
//				select(command.split(","));
//			else if(command.startsWith("update"))
//				update(command.split(","));
//			else if(command.startsWith("delete"))
//				delete(command.split(","));
//			else if(command.equals("list"))
//				list();
//			else help();
//		}
//		sc.close();
//		System.out.println("프로그램 종료");
//		
//	}
//	private static void list() {
//		Collection<Customer> list = cs.list();
//		if(list == null || list.size() == 0) {
//			System.out.println("데이터가 없습니다");
//		}else
//			for(Customer customer: list) {
//				System.out.println(customer);
//			}
//		
//	}
//	private static void delete(String[] str) {
//		if(str.length != 2) {
//			help();
//			return; //메서드 종료
//		}
//		int result = cs.delete(str[1]);
//		if(result>0)
//			System.out.println("삭제 되었습니다");
//	}
//	private static void update(String[] str) {
//		
//		if(str.length != 6) {
//			help();
//			return;//메서드 종료
//		}
//		Customer customer = new Customer(str[1],str[2],str[4],str[5],new Date());
//		if(!str[2].equals(str[3])) {
//			System.out.println("암호와 암호 확인이 다릅니다");
//			return;
//		}
//		int result = cs.update(customer);
//		if(result > 0)
//			System.out.println("고객 수정 대박 ㅋㅋ");
//		
//	}
//	private static void select(String[] str) {
//		if(str.length != 2) {
//			help();
//			return;//메서드 종료
//		}
//		Customer customer = cs.select(str[1]);
//		if(customer == null)
//			System.out.println("없는 고객입니다");
//		else
//			System.out.println(customer);
//	}
//	private static void insert(String[] str) {
//
//		if(str.length != 6) {
//			help();
//			return;//메서드 종료
//		}
//		Customer customer = new Customer(str[1],str[2],str[4],str[5],new Date());
//		if(!str[2].equals(str[3])) {
//			System.out.println("암호와 암호 확인이 다릅니다");
//			return;
//		}
//		System.out.println(customer);
//		int result = cs.insert(customer);
//		if(result > 0)
//			System.out.println("고객 등록 성공 ㅋㅋ");
//	}
//	private static void help() {
//		System.out.println("다음 명령어에서 선택하여 입력하세요");
//		System.out.println("insert, id,암호,암호확인,이메일,이름");
//		System.out.println("update, id,암호,암호확인,이메일,이름");
//		System.out.println("delete, id");
//		System.out.println("select, id"); // 데이터 한 건
//		System.out.println("list");       //모든 데이터
//		System.out.println("x");          //종료
//		
//	}
}
