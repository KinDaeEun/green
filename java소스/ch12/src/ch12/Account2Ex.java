package ch12;

public class Account2Ex {
	public static void main(String[] args) {
		Account2 act = new Account2(10000);//통장 개설
		Account2User[] au = new Account2User[5];
		au[0] = new Account2User(act, "로제");
		au[1] = new Account2User(act, "보검");
		au[2] = new Account2User(act, "은우");
		au[3] = new Account2User(act, "제니");
		au[4] = new Account2User(act, "하은");
		
		for(Account2User a: au) {
			a.start();
		}
	}
}
