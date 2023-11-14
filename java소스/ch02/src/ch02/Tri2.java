package ch02;

public class Tri2 {
	public static void main(String[] args) {
		int num = 254; // 게시판에 게시할 글수
		int numberOfPage = 10; // 한페이지 당 게시글 수
		int page; // 몇 페이지가 필요할까요?
		int i = num / numberOfPage;
		page = (num % numberOfPage == 0) ? i : i + 1;
		System.out.println(page);

	}
}
